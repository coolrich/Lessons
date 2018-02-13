package lesson15.atHome;

public class Calculator {

    public static <T1 extends Number, T2 extends Number> void sum(T1 n1, T2 n2) {
        System.out.println(n1.doubleValue() + n2.doubleValue());
    }

    public static <T1 extends Number, T2 extends Number> void substraction(T1 n1, T2 n2) {
        System.out.println(n1.doubleValue() - n2.doubleValue());
    }

    public static <T1 extends Number, T2 extends Number> void multiply(T1 n1, T2 n2) {
        System.out.println(n1.doubleValue() * n2.doubleValue());
    }

    public static <T1 extends Number, T2 extends Number> void divide(T1 n1, T2 n2) {
        System.out.println(n1.doubleValue() / n2.doubleValue());
    }

    public static void main(String[] args) {
        sum(1, 1);
        substraction(-1.1, 1.1);
        multiply(0.9999, 9999);
        divide(1234567890, 9876543210D);
    }
}
