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

import java.util.*;
class StudentFee {
    String name;
    int baseFee = 20000;
    int optionalFee = 3000;

   
    StudentFee(String name) {
        this.name = name;
    }

    
    StudentFee(String name, String course1) {
        this.name = name;
    }
   
 
    StudentFee(String name, String course1, String course2){
        this.name = name;
    }

    int calculateFee(){
        return baseFee;
    }
    int calculateFee(String course1){
        return baseFee + optionalFee;
    }


    int calculateFee(String course1, String course2) {
        return baseFee + (2 * optionalFee);
    }


    int calculateFee(double scholarshipPercentage) {
        double total = baseFee;
        double discount = total * (scholarshipPercentage / 100);
        return (int)(total - discount);
    }

    public static void main(String[] args) {


        StudentFee s1 = new StudentFee("Alisha");
        StudentFee s2 = new StudentFee("Riya", "DevOps");
        StudentFee s3 = new StudentFee("Ali", "AI", "ML");

        
       System.out.println(s1.name);
        System.out.println("Regular Admission Fee: " + s1.calculateFee());

        System.out.println(s2.name);
        System.out.println("One Optional Course Fee: " + s2.calculateFee("DevOps"));
        System.out.println(s3.name);
        System.out.println("Two Optional Courses Fee: " + s3.calculateFee("AI", "ML"));
        System.out.println("Fee after 10% Scholarship: " + s1.calculateFee(10));
    }
}