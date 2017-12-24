package lesson6.exercise15;

import java.util.Arrays;

public class PrematureDownBubbleSorter {
    /**
     * Метод для сортировки массива целых чисел
     *
     * @param array
     */
    public static void sort(int[] array) {
        int count = 0;
        outer:
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {

                if (checkPrematureTermination(array) && j >= i) {
                    System.out.println("Premature termination" + " in step " + count);
                    break outer;
                }

                if (array[j - 1] < array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;

                }
                count++;
            }
        }

    }


    /**
     * Метод, который проверяет условие
     * преждевременного завершения процесса сортировки
     *
     * @param array
     * @return
     */
    public static boolean checkPrematureTermination(int[] array) {
        boolean b = false;
        outer:
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i - 1] < array[i] && i > 1) {
                break outer;
            }
            if (array[i - 1] > array[i] && i == 1) {
                b = true;
                break outer;
            }
        }
        return b;
    }

    /**
     * Сортировка без преждевременного завершения
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

