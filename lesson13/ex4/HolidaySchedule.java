package lesson13.ex4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class HolidaySchedule {
    public static void main(String[] args) {
        DateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Calendar[] holidays = {new GregorianCalendar(2018, 0, 7),
                new GregorianCalendar(2018, 0, 14),
                new GregorianCalendar(2018, 2, 8)
        };
        System.out.printf("Xmas         : %10s\n", sdf.format(holidays[0].getTime()));
        System.out.printf("Old New Year : %10s\n", sdf.format(holidays[1].getTime()));
        System.out.printf("8 of March   : %10s\n", sdf.format(holidays[2].getTime()));

    }
}
