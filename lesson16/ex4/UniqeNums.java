package lesson16.ex4;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class UniqeNums {
    public static void printUniqeNums(Integer... nums) {
        System.out.println(new TreeSet<Integer>(Arrays.asList(nums)));
    }

    public static void main(String[] args) {
        printUniqeNums(1, 2, 3, 4, 4, 5);
    }
}
