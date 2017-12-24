package lesson4.exercise4;

public class EvenOdd {
    public static void printNum(String s) {
        System.out.println(Integer.parseInt(s));
    }

    public static boolean isOdd(String s) {
        return Integer.parseInt(s) % 2 != 0;
    }

    public static void main(String[] args) {
        if (isOdd(args[0])) {
            printNum(args[0]);
        }
    }
}
