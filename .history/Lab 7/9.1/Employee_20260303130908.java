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