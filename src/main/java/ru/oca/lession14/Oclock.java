package ru.oca.lession14;

public class Oclock {
    static void timer() {
        OUTER: for(int i = 0; i < 6; i++) {
            MIDDLE: for (int j = 0; j < 60; j++) {
                if (i > 1) {
                    break OUTER;
                }
                for (int k = 0; k < 60; k++) {
                    System.out.println(i + ":" + j + ":" + k);
                    if ((k * i) > j) {
                        continue MIDDLE;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        timer();
    }
}
