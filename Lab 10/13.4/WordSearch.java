// 13.4.  Write a Java program to search for a specific word in a file and display the number of occurrences.
import java.io.*;
import java.util.*;

public class WordSearch {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word to search: ");
        String search = sc.nextLine();

        BufferedReader br = new BufferedReader(new FileReader("source.txt"));
        String line;
        int count = 0;

        while ((line = br.readLine()) != null) {
            String words[] = line.split("\\s+");

            for (String word : words) {
                if (word.equalsIgnoreCase(search)) {
                    count++;
                }
            }
        }

        br.close();

        System.out.println("Occurrences of '" + search + "': " + count);
    }
}