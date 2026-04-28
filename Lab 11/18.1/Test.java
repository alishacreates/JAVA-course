// Student Data Management System using Collections

// Develop a Java program to manage student records using the Collections Framework.

// Use a List to store student names.
// Use a Set to maintain unique course names.
// Use a Map to associate student IDs with their respective details (name, course, marks).
// Perform the following operations:

// Add, update, and remove student records
// Display all students in sorted order
// Search for a student using ID
// Count total unique courses

import java.util.*;

class Student{
    int ID;
    String name, course;
    int marks[];

    Student (int ID, String name, String course, int[] marks){
        this.ID=ID;
        this.name= name;
        this.course=course;
        this.marks=marks;
    }

    public String toString(){
        return ID+" "+ name + " " + course + " "+ Arrays.toString(marks);

    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println("Name: Alisha, SAP: 590013908, Batch: 1");
        Student s1 = new Student(10, "Pooja", "CSE", new int[]{85,66,77,23});
        Student s2= new Student(20, "Alisha", "CSE", new int[]{72,86,97,93});
         Student s3= new Student(30, "Keshav", "CSE", new int[]{55,66,97,43});

        List<String> li = new ArrayList<>();
        
        li.add(s1.name);
        li.add(s2.name);
        li.add(s3.name);

        li.set(0, "Ali");

        Collections.sort(li);

        Set<String> s = new TreeSet<>();
        s.add(s1.course);
        s.add(s2.course);
        s.add(s3.course);

        // s.remove(s1.course);
        s.size();

        Map<Integer, Student> m = new TreeMap<>();
        m.put(s1.ID, s1);
        m.put(s2.ID, s2);
        m.put(s3.ID, s3);

        System.err.println(li);
        System.out.println(s);
        System.out.println(m);

    }
}