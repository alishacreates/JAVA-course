/*5.1: Employee Performance Matrix Analyzer

Problem Statement

A company stores employee performance ratings in a 2D array, where each row represents an employee and each column represents performance scores in different quarters.

Write a Java program to:

Store performance scores of N employees across M quarters.
Find:
Employee with highest average performance
Quarter with maximum overall performance
Employees whose performance is consistently improving
Display sorted employee list based on overall performance.

Input Example

Enter number of employees: 3

Enter number of quarters: 4

Expected Output

Top Performer: Employee 2

Best Performing Quarter: Quarter 2

Improving Employees: Employee 2

Sorted Performance Ranking:

Employee 3

Employee 1

Employee 2

*/
import java.util.Arrays;
import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        System.out.println("name: alisha, sap: 590013908, batch: 1");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of employees: ");
        int N = sc.nextInt();

        System.out.println("Enter number of quarters: ");
        int M = sc.nextInt();

        int[][] performance = new int[N][M]; 
        System.out.println("Enter performance scores:");
        for (int i = 0; i < N; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            for (int j = 0; j < M; j++) {
                performance[i][j] = sc.nextInt();
            }
        }
        double maxAvg = 0;
        int bestEmployee = 0;

        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < M; j++) {
                sum += performance[i][j];
            }
            double avg = (double) sum / M;
            if (avg > maxAvg) {
                maxAvg = avg;
                bestEmployee = i;
            }
        }

        System.out.println("\nTop Performer: Employee " 
                            + (bestEmployee + 1));
        int bestQuarter = 0;
        int maxQuarterSum = 0;

        for (int j = 0; j < M; j++) {
            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += performance[i][j];
            }
            if (sum > maxQuarterSum) {
                maxQuarterSum = sum;
                bestQuarter = j;
            }
        }

        System.out.println("Best performing quarter is: Quarter " 
         + (bestQuarter + 1));

  
        System.out.println("\nimproving employees are:");
        for (int i = 0; i < N; i++) {
            boolean improving = true;
            for (int j = 1; j < M; j++) {
                if (performance[i][j] <= performance[i][j - 1]) {
                    improving = false;
                    break;
                }
            }
            if (improving) {
                System.out.println("Employee " + (i + 1));
            }
        }

  
        Integer[] employeeIndex = new Integer[N];
        int[] totalScore = new int[N];

        for (int i = 0; i < N; i++) {
            employeeIndex[i] = i;
            for (int j = 0; j < M; j++) {
                totalScore[i] += performance[i][j];
            }
        }

        Arrays.sort(employeeIndex, (a, b) -> totalScore[b] - totalScore[a]);

        System.out.println("\nEmployees sorted by overall performance:");
        for (int i : employeeIndex) {
            System.out.println("Employee " + (i + 1) + " - Total Score: " + totalScore[i]);
        }

    }
}