
// // 13.1. Write a Java program to: // • Take student details (ID, Name, Marks) from user // • Store them in a file // • Read and display all records 
// 
import java.io.*;

import java.util.*;

class Student {
    String name;
    int roll;
    int marks;

    Student(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
    public String toString() {
        return name + " " + roll + " " + marks;
    }
}

public class Test {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = sc.nextInt();

        FileWriter fw = new FileWriter("students.txt");

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name:");
            String name = sc.next();

            System.out.println("Enter roll:");
            int roll = sc.nextInt();

            System.out.println("Enter marks:");
            int marks = sc.nextInt();

            Student s = new Student(name, roll, marks);

            fw.write(s.toString() + "\n");
        }

        fw.close();

        FileReader fr = new FileReader("students.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;

        System.out.println("Student Records");

        while ((line = br.readLine()) != null) {
            String[] data = line.split(" ");

            System.out.println("Name: " + data[0]);
            System.out.println("Roll: " + data[1]);
            System.out.println("Marks: " + data[2]);
            System.out.println();
        }

        br.close();
    }
}