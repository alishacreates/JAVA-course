// 13.3. Write a Java program to read a file and count:
// • Total number of characters
// • Total number of words
// • Total number of lines
import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("source.txt"));

        String line;
        int lines = 0;
        int words = 0;
        int characters = 0;

        while ((line = br.readLine()) != null) {
            lines++;

            characters += line.length();

            String[] w = line.trim().split("\\s+");
            if (line.trim().length() != 0) {
                words += w.length;
            }
        }

        br.close();

        System.out.println("Total lines: " + lines);
        System.out.println("Total words: " + words);
        System.out.println("Total characters: " + characters);
    }
}