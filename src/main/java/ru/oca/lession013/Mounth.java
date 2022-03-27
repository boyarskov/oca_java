package ru.oca.lession013;

public class Mounth {

    public static void daysMounth(int number) {
        switch (number) {
            case 2:
                System.out.println("В этом месяце 28 дней");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("В этом месяце 30 дней");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В этом месяце 31 день");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }

    public static void main(String[] args) {
        int mounth = 12;
        for (int i = 0; i < mounth; i++) {
            Mounth.daysMounth(i);
        }
    }
}
