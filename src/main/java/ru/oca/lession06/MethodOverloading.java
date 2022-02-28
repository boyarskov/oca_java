package ru.oca.lession06;

public class MethodOverloading {
    void summa() {
        System.out.println("Amount is: " + null);
    }

    void summa(int a) {
        System.out.println("Amount is: " + a);
    }

    void summa(int a, int b) {
        int summa = a + b;
        System.out.println("Amount is: " + summa);
    }

    void summa(int a, int b, int c) {
        int summa = a + b + c;
        System.out.println("Amount is: " + summa);
    }

    void summa(int a, int b, int c, int d) {
        int summa = a + b + c + d;
        System.out.println("Amount is: " + summa);
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
