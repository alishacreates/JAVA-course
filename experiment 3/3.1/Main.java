// 3.1 write a program in java to find binomial coefficient

import java.util.Scanner;
public class Main {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        System.out.println("Name: alisha, sap: 590013908, batch: 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        
        int n = sc.nextInt();

        System.out.println("enter r: ");
        int r = sc.nextInt();

        int nFactorial = factorial(n);
        int rFactorial = factorial(r);
        int nminusrFactorial = factorial(n - r);

        int binoCoeffient = nFactorial / (rFactorial * nminusrFactorial);

        System.out.println(binoCoeffient);
    }
}
