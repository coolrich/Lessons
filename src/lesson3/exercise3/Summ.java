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
            String sumOfInts = "Sum of integers";

            System.out.println(query1);

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
        }
    }
}
