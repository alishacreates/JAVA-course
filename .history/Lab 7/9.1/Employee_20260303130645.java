// Base abstract class
public class Employee {
    int employeeId;
    String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    // Abstract method for salary calculation
    double calculateSalary(){
        
    };

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + employeeName;
    }
}

// Full-Time Employee
class FullTimeEmployee extends Employee {
    private double monthlySalary;
    private double bonus;

    public FullTimeEmployee(int employeeId, String employeeName,
                            double monthlySalary, double bonus) {
        super(employeeId, employeeName);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary + bonus;
    }
}

// Part-Time Employee
class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int hoursWorked;

    public PartTimeEmployee(int employeeId, String employeeName,
                            double hourlyWage, int hoursWorked) {
        super(employeeId, employeeName);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}


public class SalaryCalculatorApp {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(101, "Alice", 50000, 5000);
        Employee e2 = new PartTimeEmployee(102, "Bob", 400, 80);

        System.out.println(e1);
        System.out.println("Monthly Salary: " + e1.calculateSalary());

        System.out.println(e2);
        System.out.println("Monthly Salary: " + e2.calculateSalary());
    }
}