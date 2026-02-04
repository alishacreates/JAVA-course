import java.util.Scanner;
import java.lang.Math; 
//2.3 Write a java program to calculate compound interest. Take required inputs 
// using Scanner class.
public class Main {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

        double principal, rate, time, amount, compoundInterest;
        int timesCompounded;

        System.out.print("Enter the principal amount: ");
        principal = input.nextDouble();

        System.out.print("Enter the annual interest rate (as a percentage): ");
        rate = input.nextDouble();

        System.out.print("Enter the time (in years): ");
        time = input.nextDouble();

        System.out.print("Enter the number of times interest is compounded per year: ");
        timesCompounded = input.nextInt();

        rate = rate / 100.0;


        amount = principal * (Math.pow((1 + rate / timesCompounded), (timesCompounded * time)));


        compoundInterest = amount - principal;
        System.out.println("Name: alisha, sap: 590013908, batch: 1");
        System.out.printf("Principal Amount: %.2f\n", principal);
        System.out.printf("Annual Rate: %.2f%%\n", rate * 100); 
        System.out.printf("Time in Years: %.2f\n", time);
        System.out.printf("Compounded Per Year: %d\n", timesCompounded);
        System.out.printf("Total Future Amount: %.2f\n", amount);
        System.out.printf("Compound Interest Earned: %.2f\n", compoundInterest);

    }
}
