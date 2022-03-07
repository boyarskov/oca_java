package ru.oca.lession06;

public class MethodOverloading {
    int summa() {
        int summa = 0;
        System.out.println("Amount is: " + summa);
        return summa;
    }

    int summa(int a) {
        int summa1 = a;
        System.out.println("Amount is: " + a);
        return summa1;
    }

    int summa(int a, int b) {
        int summa2 = a + b;
        System.out.println("Amount is: " + summa2);
        return summa2;
    }

    int summa(int a, int b, int c) {
        int summa3 = a + b + c;
        System.out.println("Amount is: " + summa3);
        return summa3;
    }

    int summa(int a, int b, int c, int d) {
        int summa4 = a + b + c + d;
        System.out.println("Amount is: " + summa4);
        return summa4;
    }


    public static void main(String[] args) {
        MethodOverloading example = new MethodOverloading();
        example.summa();
        example.summa(1);
        example.summa(3,4);
        example.summa(5,1,9);
        example.summa(9,11,4, 3);
    }
}
