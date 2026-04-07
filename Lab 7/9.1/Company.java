
/*9.1. A company wants to develop a Java application to calculate salaries of different types of
employees.
The company has:
• Full-Time Employees
• Part-Time Employees
All employees share common attributes such as:
• Employee ID
• Employee Name
However, salary calculation differs:
• Full-Time Employee
o Fixed monthly salary
o Additional bonus
• Part-Time Employee
o Hourly wage
o Number of hours worked
Requirements:
1. Create a base class Employee containing:
o Common data members
o A method calculateSalary()
2. Create two derived classes:
o FullTimeEmployee
o PartTimeEmployee
3. Override the calculateSalary() method in both derived classes.
4. In the main() method:
o Create objects of derived classes using a base class reference.
o Demonstrate runtime polymorphism.
o Display salary details for each employee. */
class Employee {
    int empId;
    String empName;

    Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    double calculateSalary() {
        return 0;   
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }
}

class FullTimeEmployee extends Employee {
    double fixedSalary;
    double bonus;

    FullTimeEmployee(int empId, String empName, double fixedSalary, double bonus) {
        super(empId, empName);
        this.fixedSalary = fixedSalary;
        this.bonus = bonus;
    }

    double calculateSalary() {
        return fixedSalary + bonus;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyWage;
    int hoursWorked;

    PartTimeEmployee(int empId, String empName, double hourlyWage, int hoursWorked) {
        super(empId, empName);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}

public class Company {
    public static void main(String[] args) {

        FullTimeEmployee f1 = new FullTimeEmployee(10111, "Alisha", 90000, 2000);
        PartTimeEmployee p1 = new PartTimeEmployee(10222, "Ali", 300, 30);

        System.out.println("name: alisha, sap id: 590013908, batch: 1");
        System.out.println("Full Time Employee");
        f1.displayDetails();
        System.out.println("Salary:" + f1.calculateSalary());

        System.out.println("Part Time Employee");
        p1.displayDetails();
        System.out.println("Salary:" + p1.calculateSalary());
    }
}