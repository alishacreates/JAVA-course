/* 6.2. A company wants to analyze customer feedback text automatically.

Write a Java program to:

Accept a paragraph from user.
Perform the following operations using Java String methods:
Count total words and sentences
Identify most frequently used word
Replace all negative words from a given list with "***"
Check if feedback contains promotional keywords
Display reversed sentence order
Constraints

Must use Java built-in String functions
Case insensitive processing required
Input Example

Enter feedback:

The product quality is bad but delivery was fast.

Expected Output

Total Words: 8

Most Frequent Word: product

Filtered Feedback: The product quality is *** but delivery was fast.

Contains Promotion Keyword: No

Reversed Sentence: fast was delivery but *** is quality product The

*/
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String words = sc.nextLine();
        String lower = words.toLowerCase();
        System.out.println(lower);

        String removeSpaces = words.trim();
        System.out.println("Trimmed: " + removeSpaces);
        String[] str2 = lower.split(" ");

        System.out.println("Words:");
        for (String s : str2) {
            System.out.println(s);
        }

        String[] neg = {"bad", "poor", "trash", "rejected"};
        for (String s2 : neg) {
            lower = lower.replaceAll(s2, "***");
        }
        System.out.println("After replacing negative words:");
        System.out.println(lower);
        
        
        System.out.println("sentencesplit");
        String str3 [] = lower.split("[.]");

        for(int i  = 0; i<str3.length; i++){
            System.out.println(str3[i]);
        }
            int maxcount = 0;
            String mostFrequent = "";
        for (int i = 0; i < str2.length; i++) {       
            int count = 1;
            for (int j = i + 1; j < str2.length; j++) {
                if (str2[i].equals(str2[j])) {
                    count++;
                }
            } if (count > maxcount) {
                maxcount = count;
                mostFrequent = str2[i];
            }
        }
        System.out.println("most Frequent word occuring: " + mostFrequent);
        System.out.println("frequency: " + maxcount);

        String reversed = new StringBuilder(words).reverse().toString();
        System.out.println("Reversed Sententence:");
        System.out.println(reversed);
        }
    }

    