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
        System.out.println("name: alisha, sap: 590013908, batch: 1");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter feedback:");
        String feedback = sc.nextLine();

        String lower = feedback.toLowerCase();

        String[] words = lower.split("\\s+");
        int wordCount = words.length;

        String[] sentences = feedback.split("[.!?]+");
        int sentenceCount = sentences.length;

        Map<String, Integer> freqMap = new HashMap<>();

        for (String w : words) {
            w = w.replaceAll("[^a-z]", "");
            if (!w.isEmpty()) {
                freqMap.put(w, freqMap.getOrDefault(w, 0) + 1);
            }
        }
        String mostFrequent = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        String[] negativeWords = {"bad", "poor", "worst", "slow"};
        String filteredFeedback = feedback;

        for (String neg : negativeWords) {
            filteredFeedback = filteredFeedback.replaceAll("(?i)\\b" + neg + "\\b", "***");
        }
        String[] promoWords = {"free", "offer", "discount", "sale"};
        boolean containsPromo = false;

        for (String promo : promoWords) {
            if (lower.contains(promo)) {
                containsPromo = true;
                break;
            }
        }
        String[] originalWords = feedback.replaceAll("[.!]", "").split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = originalWords.length - 1; i >= 0; i--) {
            reversed.append(originalWords[i]).append(" ");
        }
        System.out.println("\nTotal Words: " + wordCount);
        System.out.println("Most Frequent Word: " + mostFrequent);
        System.out.println("Filtered Feedback: " + filteredFeedback);
        System.out.println("Contains Promotion Keyword: " + (containsPromo ? "Yes" : "No"));
        System.out.println("Reversed Sentence: " + reversed.toString().trim());
    }
}

