package ru.oca.bookschildt;

public class Continue {
    public static void main(String[] args) {
        System.out.println("Lession continue");
        for (int i = 0; i<10; i++) {
            System.out.println("i= " + i + " ");
            if (i==5) continue;
            System.out.print("** т ");
        }
        System.out.println("Continue work ok...");
    }
}

