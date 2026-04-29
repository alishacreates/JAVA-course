abstract class Shape {
    // Abstract method
    abstract double area();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        // Dynamic binding
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);
        Shape s3 = new Triangle(8, 5);

        System.out.println("Area of Circle: " + s1.area());
        System.out.println("Area of Rectangle: " + s2.area());
        System.out.println("Area of Triangle: " + s3.area());
    }
}