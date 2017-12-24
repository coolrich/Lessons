package lesson5.exercise8;

public class Factorial {
    public static long calculateFactorial(long number) {
        if (number == 0) {
            number = 1;
        } else {
            for (long i = number; i > 1; i--) {
                number *= (i - 1);
            }
        }
        return number;
    }

    public static void main(String[] args) {
        long randNum = (long) (Math.random() * 5);
        System.out.println(calculateFactorial(randNum));
    }
}
