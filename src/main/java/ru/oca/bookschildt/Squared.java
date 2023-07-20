package ru.oca.bookschildt;

public class Squared {
    public static void main(String[] args) {
        int count = 10;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i == 0 || i == count - 1 || j == 0 || j == count - 1) {
                    System.out.print("*");
                } else if (i == j || j == count - 1 - i) {
                    System.out.print("х");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
