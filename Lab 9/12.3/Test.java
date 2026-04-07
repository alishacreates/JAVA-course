// Create a shared counter varibale accessed by two thread. One thread
//  increments it another thread decrements it. Ensure synchronous transaction
//   so that the final value is correct.

class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }

    synchronized void decrement() {
        count--;
    }
}

class IncrementThread extends Thread {
    Counter counter;

    IncrementThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

class DecrementThread extends Thread {
    Counter counter;

    DecrementThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.decrement();
        }
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println("Name: ALISHA SAP: 590013908, batch: 1");
        Counter counter = new Counter();

        IncrementThread t1 = new IncrementThread(counter);
        DecrementThread t2 = new DecrementThread(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Final Counter Value: " + counter.count);
    }
}