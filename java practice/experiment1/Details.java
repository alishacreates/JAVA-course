package experiment1;
import java.util.*;

//  1.2.  Write a Java program to print the details of a student.
class Student {
    String name;
    int SAP;

    Student(String name, int SAP){
        this.name = name;
        this.SAP = SAP;
    }
    public void PrintDetails(){
        Student s1 = new Student(name, SAP);
          System.out.println(s1.name);
          System.out.println(s1.SAP);
    }
} 
public class Details{
    public static void main(String[] args) {
        System.out.println("enter your details");
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your SAP: ");
        int s = sc.nextInt();
        sc.nextLine();
        System.out.println("enter your Name: ");
        String n = sc.nextLine();
        

        Student s2 = new Student(n, s);

        s2.PrintDetails();
        sc.close();

    }
    
}
