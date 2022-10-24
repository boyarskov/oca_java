package ru.oca.bookschildt;

public class Recursion {
    int fact(int n) {
        int rsl;

        if (n==1) {
            return 1;
        }
        rsl = fact(n - 1) * n;
        return rsl;
    }

    public static void main(String[] args) {
            Recursion f = new Recursion();
            System.out.println("Факториал 3 равен: " + f.fact(3));
            System.out.println("Факториал 5 равен: " + f.fact(5));
        }
    }
