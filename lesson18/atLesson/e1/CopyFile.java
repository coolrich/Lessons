package lesson18.atLesson.e1;

import java.io.*;

/**
 * Created by student on 25.02.2018.
 */
public class CopyFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\student\\Desktop\\temp\\src\\l18\\file.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\student\\Desktop\\temp\\src\\l18\\newFile.txt"))) {
            String str;
            while ((str = reader.readLine()) != null) {
                writer.write(str);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
