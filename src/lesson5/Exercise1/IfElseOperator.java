package lesson5.exercise1;

import java.util.Scanner;

public class IfElseOperator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Введите число от 0 до 10");
        if (s.hasNextInt()) {
            n = s.nextInt();
            check(n);
        }
    }
    public static void check(int n){
        if (n < 10 && n > 0) {
            System.out.println("число в пределах");
        } else {
            System.out.println("число вышло за предлы");
        }
    }
}
