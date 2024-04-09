package ru.oca.lession18;

public class Max {
    public static int findMin(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] number = new int[]{1, 5, 7, 9, 77, 34, 12};
        System.out.println(findMin(number));
    }
}