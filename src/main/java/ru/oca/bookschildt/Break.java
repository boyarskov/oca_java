package ru.oca.bookschildt;

public class Break {
    public static void main(String[] args) {
        System.out.println("Lession break");
        for (int i = 0; i < 10; i++)
        one: {
            for (int j = 0; j < 10; j++)
            two: {
                for (int k = 0; k < 10; k++)
                three: {
                    System.out.println("i=" + i + " j=" + j + " k=" + k);
                    if (k==3) break one;
                }
            }
        }
        System.out.println("Break work ok...");
    }
}
