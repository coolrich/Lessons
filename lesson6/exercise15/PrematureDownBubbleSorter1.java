package lesson6.exercise15;

import java.util.Arrays;

public class PrematureDownBubbleSorter1 {
    /**
     * Метод для сортировки массива целых чисел
     *
     * @param array
     */
    public static void sort(int[] array) {

        boolean b = true;
        for (int i = 0; i < array.length; i++) {

            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] < array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    b = false;
                }
                if (b) {
                    break;
                }
                b = true;
            }

        }

    }

    /**
     * Сортировка без преждевременного завершения
     *
     * @param array
     */
    public static void simpleBubbleSort(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                count++;
                if (array[j - 1] < array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println("Termination" + " in step " + count);
    }

    public static void main(String[] args) {
//        int[] m = {8, 7, 3, 4, 5, 6, 7};
        int[] m = {5, 0, 4, 1, 4, 2, 3};
        int[] m1 = m.clone();
        sort(m);
        System.out.println(Arrays.toString(m));
        simpleBubbleSort(m1);
        System.out.println(Arrays.toString(m1));

    }
}

