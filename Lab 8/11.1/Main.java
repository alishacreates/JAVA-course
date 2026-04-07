// Write a Java program to:
// • Create a user-defined exception InvalidAgeException
// • Throw the exception if age is less than 18
// • Handle it using try-catch block
// • Explain the flow of execution
// • Write a main() method to demonstrate all functionalities.
// Step 1: Create user-defined exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
class AgeChecker {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            
            throw new InvalidAgeException("Age is less than 18. Not eligible.");
        } else {
            System.out.println("Age is valid. You are eligible.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int age = 16; 
        try {
            AgeChecker.checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Program continues after exception handling.");
    }
}
