package ru.oca.lession06;

public class Overloaded {
    int Overloaded() {
        int rsl = 0;
        System.out.println(rsl);
        return rsl;
    }

    int Overloaded(int a) {
        int rsl = a;
        System.out.println(rsl);
        return rsl;
    }

    int Overloaded(int a, int b) {
        int rsl = a + b;
        System.out.println(rsl);
        return rsl;
    }

    int Overloaded(int a, int b, int c) {
        int rsl = a + b + c;
        System.out.println(rsl);
        return rsl;
    }

    int Overloaded(int a, int b, int c, int d) {
        int rsl = a + b + c + d;
        System.out.println(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        Overloaded a = new Overloaded();
        a.Overloaded(800);
        a.Overloaded(56, 24);
        a.Overloaded(75, 35, 80);
        a.Overloaded(8, 9, 43, 94);
    }
}
