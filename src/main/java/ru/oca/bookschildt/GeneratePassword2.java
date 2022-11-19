package ru.oca.bookschildt;

import java.util.Random;
import java.util.Scanner;

public class GeneratePassword2 {

    static private String[] data = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
    "q", "r", "s", "t", "u", "v", "w", "x", "y","z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
    "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
    "!", "@", "#"};

    static private int randomNum(int min, int max) {
        Random random = new Random();
        return random.nextInt(max) + min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String S = sc.nextLine();
            int length = randomNum(4, 10);
            String[] p = new String[length];

            for (int i = 0; i < length; i++) {
                p[i] = data[randomNum(0, data.length)];
            }

            String password = "";

            for(String s : p) {
                password += s;
            }
            System.out.printf(password);
        }
    }


}
