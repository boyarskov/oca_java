package ru.oca.lession18;

import java.util.Arrays;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
       int[] number = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1};
       int[] number2 = back(number);
       System.out.println(Arrays.toString(number2));
       int[] input = new int[]{4, 1, 6, 2};
       int[] input2 = back(input);
       System.out.println(Arrays.toString(input2));
    }
}