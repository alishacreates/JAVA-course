/*
7.1. Develop a Java program that models a Student Result System using a Student class.

Requirements:

1. Create a class named Student with the following data members:
   - rollNo
   - name
   - course
   - marks[]
   - total
   - percentage
   - grade

2. Use a parameterized constructor to initialize:
   - Roll Number
   - Name
   - Course

   (These values must be taken using command line arguments.)

3. Accept 5 subject marks using Scanner or BufferedReader.

4. Implement member methods:
   - calculateResult() -> Calculates total, percentage, and grade
   - displayResult() -> Displays formatted result using printf()

5. Grade Criteria:
   Percentage    Grade
   >= 90         A+
   >= 80         A
   >= 70         B
   >= 60         C
   >= 50         D
   < 50          F
*/

import java.util.Scanner;

public class Student {
    int rollNo;
    String name;
    String course;
    int marks[];
    int total;
    double percentage;
    String grade;

    Student(int roll, String n, String c){
        rollNo=roll;
        name=n;
        course=c;
    }
    void inputMarks(){
      System.out.println("enter marks");
      Scanner sc = new Scanner(System.in);
      for(int i = 0; i<marks.length; i++){
         marks[i] = sc.nextInt();
      }
    }

    void calculateResult(){
        for(int i: marks){
         total = total+i;
        
        percentage = total /(double)5 ;
        if(percentage >= 90){
         grade = "A+";
        }
        else if(percentage>=80 && percentage <90){
         grade = "A";
        } 
        else if(percentage>=70 && percentage<80){
         grade="B";
        }
        else if(percentage>=60 && percentage<70){
         grade = "C";
        }
        else if(percentage>=50 && percentage<60){
         grade = "D";
        }
        else if(percentage < 50){
         grade = "F";
        }
      }
    }
    void displayResult(){
       System.out.println("the result is: ");
       System.out.println("name is" + name);
       System.out.println("roll number: " +rollNo);
       System.out.println("course: " +course);
       System.out.println("total: " +total);
       System.out.println("percentage: " +percentage);
       System.out.println("grade: "+ grade);
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        Student s = new Student(a, args[1], args[2]);

       s.inputMarks();
       s.calculateResult();
       s.displayResult();


    }

}
