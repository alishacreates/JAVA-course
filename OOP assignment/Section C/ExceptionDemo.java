import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter integers only.");
        }
        catch (Exception e) {
            System.out.println("Some unexpected error occurred.");
        }
        finally {
            sc.close();
            System.out.println("Program ended.");
        }
    }
}