package ru.oca.lession18;

public class FindLoop {
    public static int indexOf (int[] data, int element) {
        int rsl = -1;
        for (int i = 0; i < data.length; i++) {
           if (data[i] == element) {
           rsl = i;
               System.out.println(element + " находится на индексе элемента " + i);
           break;
           }
       }
        return rsl;
    }

    public static void main(String[] args) {
        int[] data = new int[] {5, 10, 3};
        indexOf(data, 3);
        indexOf(data, 5);
    }
}
