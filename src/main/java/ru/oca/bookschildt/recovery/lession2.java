package ru.oca.bookschildt.recovery;

public class lession2 {
    public static void main(String[] args) {
        byte a = 12;
        byte b = 0xC;
        byte c = 014;
        byte d = 0b1100;

        short e = 1300;
        short f = 0x514;
        short g = 02424;
        short h = 0b010100010100;

        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;

        long m = 123456789L;
        long n = 0x75BCD15L;
        long o = 0726746425L;
        long p = 0b0111010110111100110100010101L;

        float q = 3.33f;
        float r = 5.43f;
        System.out.println("Q: " + q);
        System.out.println("R: " + r);
        System.out.println("Q * R: "+ q * r);

        double s = 89.10;
        double t = 9.5;
        System.out.println("S: " + s);
        System.out.println("T: " + t);
        System.out.println("S/T: " + s / t);

        boolean u = true;
        boolean v = false;
        System.out.println("U: " + u);
        System.out.println("V: " + v);

        char w = 'A';
        char x = 777, y = '\u0555';
        System.out.println("w: " + w);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
