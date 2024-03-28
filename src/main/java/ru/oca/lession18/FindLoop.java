package ru.oca.lession18;

public class FindLoop {
    public static int indexInRange(int[] data, int element,int start, int finish) {
        int rsl = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == element) {
                rsl = i;
                //System.out.println(element + " находится на индексе элемента " + i);
                break;
            }
        }

        return rsl;
    }

    public static int indexOf (int[] data, int element) {
        int rsl = -1;
        for (int i = 0; i < data.length; i++) {
           if (data[i] == element) {
           rsl = i;
               //System.out.println(element + " находится на индексе элемента " + i);
           break;
           }
       }
        return rsl;
    }

    public static void main(String[] args) {
        int[] data = new int[] {6, 10, 3, 20, 23, 6, 8};
        indexOf(data, 3);
        indexOf(data, 5);
        indexInRange(data, 6, 2, 6);
    }
}
