package ru.oca.lession014;

public class Timer {

    public static void counter() {
        for (int h = 0; h <= 6; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s <= 60; s++) {
                    System.out.print(h + "h:" + m + "m:" + s+ "s:");
                    System.out.println();
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        counter();
    }
}
