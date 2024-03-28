package ru.oca.lession18;

import java.util.Arrays;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i, data.length - 1);
            SwitchArray.swap(data, i, index);
        }
        return data;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{3, 5, 6, 8, 9, 1, 2, 4};
        System.out.println(Arrays.toString(sort(numbers)));
    }
}
