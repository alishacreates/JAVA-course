// 4.1 write a program in java to check whether a number is strong or not.
// if the sum of the factorial of the digits of that number is the number itself then it is strong.

import java.util.Scanner;

public class Test {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {

        System.out.println("Name: alisha, sap: 590013908, batch: 1");
        
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number:");
        int number = sc.nextInt();
        
        int i = 0;
        int sum = 0;

        while(number<=0){
        i = number % 10;
        number = number - (number/10);
        sum = sum + factorial(i);
        i++;
        }

        System.out.println("sum is: "+ sum);
        if (sum == number){

           System.out.println( "it is a strong number");
        } else {
            System.out.println("it is not a strong number ");
        }

    }
}
