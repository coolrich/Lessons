package lesson5.exercise3;

/**
 * Created by student on 17.12.2017.
 */
public class SwitchOperator {
    public static void main(String[] args) {
        String day = args.length > 0 ? args[0] : "6";
        int i = Integer.parseInt(day);
        switch (i) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("You entered wrong value");
        }
    }
}
