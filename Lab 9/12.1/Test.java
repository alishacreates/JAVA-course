// 12.1.  Write a java program to create two threads. One thread prints number from 1-10. 
// Another thread print alphabet from A-J. Both should run simultaneously. 

class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class AlphabetThread extends Thread {
    public void run() {
        for (char ch = 'A'; ch <= 'J'; ch++) {
            System.out.println("Alphabet: " + ch);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println("Name: ALISHA SAP: 590013908, batch: 1");
        NumberThread t1 = new NumberThread();
        AlphabetThread t2 = new AlphabetThread();

        t1.start();
        t2.start();
    }
}