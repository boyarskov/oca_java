package ru.oca.lession18;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {4, 5, 2, 3, 8, 9};
        System.out.println(findMin(numbers));
    }
}