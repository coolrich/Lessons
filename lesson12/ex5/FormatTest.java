package lesson12.ex5;

import java.util.Formatter;

/**
 * Created by student on 28.01.2018.
 */
public class FormatTest {
    public static void formatString(String studentName, int mark, String subjectName) {
        Formatter formatter = new Formatter();
        formatter.format("%15s gave mark %3d on subject %10s", studentName, mark, subjectName);
        System.out.println(formatter);
    }

    public static void formatString1(String studentName, int mark, String subjectName) {
        System.out.printf("%15s gave mark %3d on subject %10s", studentName, mark, subjectName);
    }

    public static void main(String[] args) {
        formatString("Egor", 90, "physics");
        formatString1("Egor", 90, "physics");
    }
}
