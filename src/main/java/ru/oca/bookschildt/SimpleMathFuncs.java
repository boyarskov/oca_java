package ru.oca.bookschildt;

public class SimpleMathFuncs {
    public static boolean isFactor(int a, int b) {
        if ((b % a) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int lcf(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        int min = a < b ? a : b;

        for (int i = 2; i <= min / 2; i++) {
            if (isFactor(i, a) && isFactor(i, b))
                return i;
            } return 1;
            }

    public static int gcf(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        int min = a < b ? a : b;

        for (int i = min/2; i >=2; i--) {
            if (isFactor(i, a) && isFactor(i, b))
                return i;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isFactor(5,25));
        System.out.println(lcf(87, 25));
        System.out.println(gcf(982, 32));
    }
}
