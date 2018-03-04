package lesson5.exercise12;

import java.util.Arrays;

public class CreateCharArray {
    public static void printCharArray(char[][] ch) {
        System.out.println(Arrays.deepToString(ch));
    }

    public static void main(String[] args) {
        char[][] ch = {{'a', 'b'}, {'c', 'd'}, {'e', 'f'}, {'g', 'h'}};
        printCharArray(ch);
    }
}
