// 12.2. Create a class implementing Runnbale interface that prints a multiplication table of a given number. 
class Table implements Runnable {
    int number;

    Table(int number) {
        this.number = number;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println("Name: ALISHA SAP: 590013908, batch: 1");
        Table obj = new Table(5);
        Thread t = new Thread(obj);
        t.start();
    }
}