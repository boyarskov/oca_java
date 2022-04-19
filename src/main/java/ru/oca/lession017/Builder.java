package ru.oca.lession017;

public class Builder {
    public static boolean revenstro(StringBuilder one, StringBuilder two) {
        boolean rsl = true;
        if (one.length() == two.length()) {
            for (int i = 0; i < one.length(); i++) {
                if (one.charAt(i) != two.charAt(i)) {
                    rsl = false;
                }
            }
        } else {
            rsl = false;
        }
        return rsl;
    }

    public static void main(String[] args) {
        StringBuilder one = new StringBuilder("Good day");
        StringBuilder two = new StringBuilder("Good day");
        StringBuilder three = new StringBuilder("good day");
        System.out.println(revenstro(one, two));
        System.out.println(revenstro(one, three));
    }
}