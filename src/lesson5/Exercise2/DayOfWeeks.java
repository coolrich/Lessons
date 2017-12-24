package lesson5.exercise2;

/**
 * Created by student on 17.12.2017.
 */
public class DayOfWeeks {
    public static void main(String[] args) {
        String day = args.length > 0 ? args[0] : "1";

        if ("1".equals(day)) {
            System.out.println("Monday");
        }
        if ("2".equals(day)) {
            System.out.println("Tuesday");
        }
        if ("3".equals(day)) {
            System.out.println("Wednesday");
        }
        if ("4".equals(day)) {
            System.out.println("Thursday");
        }
        if ("5".equals(day)) {
            System.out.println("Friday");
        }
        if ("6".equals(day) || "7".equals(day)) {
            System.out.println("Weekend");
        }
    }
}
