// 2.1.  Write a Java program to input two numbers and perform four arithmetic operations using command line arguments.

// 2.2.  Write a Java program to input n numbers using command line arguments and print them in reverse order.

// 2.3.  Write a java program to calculate compund intereset. Take required inputs using Scanner class.

public class Test {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("addition:"+ (num1+num2));
        System.out.println("substraction:"+ (num1-num2));
        System.out.println("multiplication:"+ (num1*num2));
        System.out.println("division:"+ (num1/num2));
    }
}
