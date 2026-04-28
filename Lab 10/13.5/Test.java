// 13.5. Write a Java program to replace all occurrences of a given word with another word in a file.
import java.io.*;
import java.util.*;

public class Test{
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter word to replace:");
        String oldWord = sc.next();

        System.out.println("Enter new word:");
        String newWord = sc.next();

        BufferedReader br = new BufferedReader(new FileReader("source.txt"));
        FileWriter fw = new FileWriter("destination.txt");

        String line;

        while ((line = br.readLine()) != null) {
            line = line.replace(oldWord, newWord);
            fw.write(line + "\n");
        }

        br.close();
        fw.close();

        System.out.println("Replacement done successfully!");
    }
}
