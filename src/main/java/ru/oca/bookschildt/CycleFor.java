package ru.oca.bookschildt;

public class CycleFor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print(".");
            }
            System.out.println();
            }
        }
    }
