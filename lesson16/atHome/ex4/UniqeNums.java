package lesson16.atHome.ex4;

import java.util.Arrays;
import java.util.TreeSet;

public class UniqeNums {
    public static void printUniqeNums(Integer... nums) {
        System.out.println(new TreeSet<Integer>(Arrays.asList(nums)));
    }

    public static void main(String[] args) {
        printUniqeNums(1,2,3,4,4,5);
    }
}
