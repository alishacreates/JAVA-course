// A coaching institute wants to develop a small Java application to manage student fee
// calculations.
// Design a class StudentFee that satisfies the following requirements:
// 1. The institute offers three types of admissions:
// o Regular admission (only student name)
// o Admission with one optional course
// o Admission with two optional courses
// Create overloaded constructors to initialize student details based on the type of
// admission.
// 2. The fee structure is as follows:
// o Base fee: ₹20,000
// o Each optional course adds ₹3,000
// 3. Implement overloaded methods named calculateFee():
// o One method that calculates only the base fee.
// o One method that calculates fee with one optional course.
// o One method that calculates fee with two optional courses.
// o One method that also applies a scholarship discount (percentage-based).
// 4. In the main() method:
// o Create objects using different constructors.
// o Call appropriate overloaded methods.
// o Display the total fee payable in each case.


class StudentFee {
    String name;
    int baseFee = 20000;
    int optionalFee = 3000;
    int totalFee;


    StudentFee(String name) {
        this.name = name;
        totalFee = baseFee;
    }

   
    StudentFee(String name, String course1) {
        this.name = name;
        totalFee = baseFee + optionalFee;
    }

    
    StudentFee(String name, String course1, String course2) {
        this.name = name;
        totalFee = baseFee + (2 * optionalFee);
    }

    // One method that calculates only the base fee.
// One method that calculates fee with one optional course.
// One method that calculates fee with two optional courses.
    calculateFee(){

    }

    calculateFee(){
        
    }

    calculateFee(){

    }


    public static void main(String[] args) {
        StudentFee s1 = new StudentFee("Alisha");
        StudentFee s2 = new StudentFee("Riya", "AI");
        StudentFee s3 = new StudentFee("Karan", "AI", "ML");

    }
}