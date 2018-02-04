package lesson13.atLesson.ex1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarDemo{
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(1994,4,27);
        System.out.println("Day of week "+calendar.getTime());
        Date myBirth = calendar.getTime();
        System.out.println("My birth's date "+myBirth.getTime());
    }
}