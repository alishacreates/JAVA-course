/*
7.2. Develop a Java program that models a Student Result System for n number of students.
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
        marks = new int [5];
    }
    void inputMarks(){
      System.out.println("enter marks");
      Scanner sc = new Scanner(System.in);
      for(int i = 0; i<marks.length; i++){
         marks[i] = sc.nextInt();
      }
    }

    void calculateResult(){
      total = 0;
        for(int i: marks){
         total = total+i;
        }
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
        System.out.println("name: alisha, sap: 590013908, batch: 1");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of students n: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i = 1; i<=n; i++){
         System.out.println("enter the name: ");
        String name = sc.nextLine();
        System.out.println("enter the roll number: ");
         int rolln = sc.nextInt();
         sc.nextLine();
         System.out.println("enter the course: ");
        String course = sc.nextLine();
        sc.nextLine();


        Student s = new Student(rolln, name, course);
       s.inputMarks();
       s.calculateResult();
       s.displayResult();
        } 
    }

}
