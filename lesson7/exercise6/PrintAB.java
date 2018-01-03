package lesson7.exercise6;

public class PrintAB {

    public static void printNumbers(int a, int b) {
        if (a == b) {
            System.out.println(a);
            System.exit(0);
        }
        if (a <= b) {
            System.out.println(a++);
        } else {
            System.out.println(a--);
        }
        printNumbers(a, b);
    }

    public static void main(String[] args) {
        printNumbers(10, 1);
    }
}
