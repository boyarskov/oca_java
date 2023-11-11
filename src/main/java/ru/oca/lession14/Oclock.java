package ru.oca.lession14;

public class Oclock {

    public static void timer() {
        OUTER: for(int i = 0; i < 6; i++) {
            for (int j = 0; j < 60; j++) {
                if (i > 1 && j % 10 == 0) {
                    break OUTER;
                }
                for (int k = 0; k < 60; k++) {
                    System.out.println(i + ":" + j + ":" + k);
                    if ((k * i) > j) {
                        j++;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Oclock.timer();
    }
}
