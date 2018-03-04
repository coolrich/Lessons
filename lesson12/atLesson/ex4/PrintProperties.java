package lesson12.atLesson.ex4;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by student on 28.01.2018.
 */
public class PrintProperties {
    public static void printProperties(Locale l) throws UnsupportedEncodingException {
        ResourceBundle rb = ResourceBundle.getBundle("TopicsForJava", l);
        for (String key : rb.keySet()) {
            System.out.println(new String((rb.getString(key))
                    .getBytes("ISO-8859-1"), "windows-1251"));
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Russian internationalization:");
            printProperties(new Locale("ru", "RU"));
            System.out.println("English internationalization:");
            printProperties(new Locale("en", "US"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
