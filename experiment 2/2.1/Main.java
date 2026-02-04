/*2.1.  Write a Java program to input two numbers and perform four arithmetic operations
 using command line arguments. */

public class Main {
    public static void main(String args[]){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Name: Alisha, SAP: 590013908, Batch: 1");
        System.out.println("the sum is: "+ (a+b));
        System.out.println("the difference is: "+ (a-b));
        System.out.println("the product is: "+ (a*b));
        System.out.println("the quotient is: "+ (a/b));
    }
}
