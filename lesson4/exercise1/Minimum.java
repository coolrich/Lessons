package lesson4.exercise1;

import java.util.Scanner;

public class Minimum {

    public static void sortAscending(double[] m) {
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                if (m[i] > m[j]) {
                    double t = m[i];
                    m[i] = m[j];
                    m[j] = t;
                }
            }
        }
    }

    public static void init(double[] m, Scanner s) {
        int c = 0;
        while (c < m.length) {
            if (s.hasNextDouble()) {
                double t = s.nextDouble();
                m[c] = t > 0 ? t : -t;
                c++;
            } else {
                s.next();
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[] m = new double[3];
        init(m, s);
        sortAscending(m);
        System.out.println(m[0]);
    }
}
