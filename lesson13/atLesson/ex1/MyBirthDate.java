package lesson13.atLesson.ex1;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Created by student on 04.02.2018.
 */
public class MyBirthDate {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(1994,4,27);
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG, Locale.forLanguageTag("UK"));
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}
