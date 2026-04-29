class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        System.out.println("Employee constructor called");
    }

    public double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    protected double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary); // constructor chaining
        this.bonus = bonus;
        System.out.println("Manager constructor called");
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Director extends Manager {
    private double allowance;

    public Director(String name, double baseSalary, double bonus, double allowance) {
        super(name, baseSalary, bonus); // constructor chaining
        this.allowance = allowance;
        System.out.println("Director constructor called");
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus + allowance;
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Director d = new Director("Piyush", 50000, 10000, 15000);
        System.out.println("Total Salary of Director: " + d.calculateSalary());
    }
}