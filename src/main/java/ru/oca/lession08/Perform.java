package ru.oca.lession08;

public class Perform {

    static int perform(int a, int b, int c) {
        return a * b * c;
    }

    static void perform(int a, int b) {
        System.out.println("Целое частное = " + a / b + "; Остаток = " + a % b);
    }

    public static void main(String[] args) {
        System.out.println(Perform.perform(5, 8, 5));
        Perform.perform(6, 2);

        System.out.println(Perform.perform(2, 1, 5));
        Perform.perform(12, 5);
    }
}
