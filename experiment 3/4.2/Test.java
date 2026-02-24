
// 4.2.  Write a java program to print the N bit binary counter in increasing order.

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("Name: alisha, sap: 590013908, batch: 1");
        Scanner sc = new Scanner (System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();

        int [] a = new int [n];

        System.out.println("n-bit Binary Counter:\n");

        for (int count = 0; count < Math.pow(2,n); count++) {

            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]);
            }
            System.out.println();


            int carry = 1;
            for (int i = a.length - 1; i >= 0; i--) {
                int temp = a[i] ^ carry;
                carry = a[i] & carry;
                a[i] = temp;

                if (carry == 0) {
                    break;
                }
            }
        }
    }
}
