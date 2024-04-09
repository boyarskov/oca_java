package ru.oca.lession18;

public class MatrixSum {
    public static int sum (int[][] array) {
        int rsl = 0;
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                rsl += array[i][k];
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int numbers[][] = {
                {5, 7, 3, 7},
                {4, 3, 3},
                {2, 5, 7}
        };
        System.out.println(sum(numbers));
    }
}
