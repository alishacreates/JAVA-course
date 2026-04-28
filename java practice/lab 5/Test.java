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

class Student{
    int rollNo;
    String name;
    String course;
    int marks[];
    int total;
    double percentage;
    String grade;
    Student( String name,int rollNo, String course){
        this.name = name;
        this.rollNo=rollNo;
        this.course=course;
    }
    void calculateResult(int total, double percentage, String grade, int marks[]){
        for(int i=0; i<marks.length; i++){
            total = total + marks[i];
        }
        percentage = (total / marks.length) * 100;

        if(percentage>= 90){
            grade = "A+";
        } else if (percentage>=80){
            grade = "A";
        } else if (percentage>=70){
            grade = "A";
        } else if (percentage>=80){
            grade = "A";
        }
    }
    void displayResult(){
        System.out.println("Result is: ");
        System.out.println("total marks scored:" + total);
        System.out.println("percentage scored:" + percentage);
    }
}
public class Test {
    public static void main(String[] args) {

        
    }
}
