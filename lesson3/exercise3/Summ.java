package lesson3.exercise3;

import java.util.Scanner;

public class Summ {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a;
            int b;
            boolean isWrong = false;
            String error = "Error, please enter the integer";
            String query1 = "Enter the first integer:";
            String query2 = "Enter the second integer:";
            String sumOfInts = "the sum of the integers is ";
            System.out.println(query1);
            while (true) {
                sc = checkInput(sc, isWrong, error, query2, sumOfInts);
            }
        }
    }

    private static Scanner checkInput(Scanner sc, boolean isWrong, String error, String query2, String sumOfInts) {
        int a;
        int b;
        if (sc.hasNextInt()) {
            a = sc.nextInt();
            System.out.println(query2);
            if (sc.hasNextInt()) {
                b = sc.nextInt();
                System.out.println(sumOfInts + sum(a, b));
            } else {
                isWrong = true;
            }
        } else {
            isWrong = true;
        }
        if (isWrong) {
            System.out.println(error);
            sc = new Scanner(System.in);
        }
        return sc;
    }
}
