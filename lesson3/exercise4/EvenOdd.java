package lesson3.exercise4;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String s;
        
        while (sc.hasNextInt()) {
            if ((sc.nextInt() & 1) == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
        System.out.println("Error");
    }
}
