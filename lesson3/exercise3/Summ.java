package lesson3.exercise3;

import java.util.Scanner;

public class Summ {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String query1 = "Enter the first integer:";
        String query2 = "Enter the second integer:";
        String sumOfInts = "the sum of the integers is ";
        while (true) {
            System.out.println(query1);
            int a = checkInput(sc);
            System.out.println(query2);
            int b = checkInput(sc);
            System.out.println(sumOfInts + sum(a, b));
        }
    }

    public static int checkInput(Scanner sc) {
        int intVal = 0;
        boolean b;
        do {
            if (b = sc.hasNextInt()) {
                intVal = sc.nextInt();
            } else {
                System.out.print("Press enter and input right value, please!");
                sc.next();
            }

        } while (!b);

        return intVal;
    }

}
