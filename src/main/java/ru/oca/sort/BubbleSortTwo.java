package ru.oca.sort;


import java.util.Arrays;

public class BubbleSortTwo {
    public static void main(String[] args) {
        int[] array = new int[]{1, 23, 32, 31, 54, 78, 11, 24, 30};
        System.out.println(Arrays.toString(array));
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
