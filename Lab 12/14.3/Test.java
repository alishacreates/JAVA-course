interface CalculatorOperation {
    double operate(double a, double b);
}
public class Test{
    public static void main(String[] args) {

        CalculatorOperation add = (a, b) -> a + b;
        CalculatorOperation sub = (a, b) -> a - b;
        CalculatorOperation mul = (a, b) -> a * b;
        CalculatorOperation div = (a, b) -> {
            if (b == 0) {
                System.out.println("Cannot divide by zero");
                return 0;
            }
            return a / b;
        };

        double x = 10, y = 5;
        System.out.println("alisha , 590013908");
        System.out.println("Addition: " + add.operate(x, y));
        System.out.println("Subtraction: " + sub.operate(x, y));
        System.out.println("Multiplication: " + mul.operate(x, y));
        System.out.println("Division: " + div.operate(x, y));
    }
}
