package lesson12.atLesson.ex1;

/**
 * Created by student on 28.01.2018.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("c+ab");
        Matcher matcher = pattern.matcher("cab");
        System.out.println(matcher.matches());
        matcher = pattern.matcher("ccab");
        System.out.println(matcher.matches());
        matcher = pattern.matcher("cccab");
        System.out.println(matcher.matches());

    }
}