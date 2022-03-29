package ru.oca.lession014;

public class Timer {

    public static void counter() {
        //выводить на экран время в формате "час:минута:секунда" в интервале от 0 до 6 часов
        for (int h = 0; h <= 6; h++) {
            //System.out.print(h + ":");
            for (int m = 0; m < 60; m++) {
                //System.out.print(m + ":");
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
