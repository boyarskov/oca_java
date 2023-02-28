package ru.oca.sort;

public class BubbleSort {
    public static void bubbleSort(int[] sortArr) {
        for(int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] sortArr = {13, 7, 5, 2, 16, 11};
        bubbleSort(sortArr);
        for(int i = 0; i < sortArr.length; i++) {
            System.out.println(sortArr[i]);
        }
    }
}
