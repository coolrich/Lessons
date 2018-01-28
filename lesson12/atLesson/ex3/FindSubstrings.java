package lesson12.atLesson.ex3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by student on 28.01.2018.
 */
public class FindSubstrings {
    public static String splitter(String s) {
        String regExp = "Java\\s*\\d";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(s);
        String result = "";
        while (matcher.find()) {
            result += matcher.group();
            result += " ";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(splitter("Versions: Java  5, Java 6, Java   7, Java 8."));
    }
}
