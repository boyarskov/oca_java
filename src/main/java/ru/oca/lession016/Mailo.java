package ru.oca.lession016;

public class Mailo {

    public static void verifMail(String email) {
        int a = 0;
        int b = 0;
        int c = 0;
        while (c < email.length() - 1) {
            a = email.indexOf('@', c);
            b = email.indexOf('.', c);
            c = email.indexOf(';', c + 1);
            System.out.println(email.substring(a + 1, b));

        }
    }

    public static void main(String[] args) {
        Mailo emails = new Mailo();
        Mailo.verifMail("ya@yahoo.com; on@mail.ru; ona@gmail.com;");

    }
}

