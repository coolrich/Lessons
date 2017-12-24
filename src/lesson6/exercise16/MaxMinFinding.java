package lesson6.exercise16;

import java.util.Arrays;

public class MaxMinFinding {
    /**
     * Метод для сортировки целых числел
     *
     * @param a 2-х мерный массив хранящий целые числа
     * @return
     */
    private static int[][] sort(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = a[i].length - 1; k > j; k--) {
                    if (a[i][k - 1] > a[i][k]) {
                        int tmp = a[i][k - 1];
                        a[i][k - 1] = a[i][k];
                        a[i][k] = tmp;

                    }
                }
            }
        }
        return a;
    }

    /**
     * Метод для нахождения максимального и минимального значений
     * в отсортированом массиве целых чисел
     *
     * @param init
     * @param result
     * @return
     */
    public static int[][] findMaxAndMin(int[][] init, int[][] result) {
        int[][] array = sort(init);
        for (int i = 0; i < init.length; i++) {
            result[i][0] = array[i][0];
            result[i][1] = array[i][array[i].length - 1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] initialArray = {{8, 7, 6, 5, 4, 3, 2, 1}, {9, 8, 7, 6, 5, 4, 3, 2}, {1, 9, 7, 3, 5, 8, 2, 6}, {3, 7, 5, 1, 9, 6, 4, 8}, {1, 7, 3, 9, 5, 2, 6, 4}};
        int[][] resultingArray = new int[5][2];
        System.out.println(Arrays.deepToString(findMaxAndMin(initialArray, resultingArray)));
    }
}
