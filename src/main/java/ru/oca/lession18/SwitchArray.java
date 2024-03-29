package ru.oca.lession18;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

    public static int[] swapBoarder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBoarder(numbers);
        for (int i = 0; i < rsl.length; i++) {
            System.out.println(rsl[i]);
        }
        System.out.println("stop swapBoarder");
        int[] numbersSwap = new int[] {1, 2, 3, 4, 5, 6};
        int[] rslSwap = swap(numbersSwap, 3, 5);
        for (int i = 0; i < rslSwap.length; i++) {
            System.out.println(rslSwap[i]);
        }
    }
}
