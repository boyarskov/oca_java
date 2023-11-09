package ru.oca.lession13;

public class Month {
    public static void days(int mounth) {
        switch (mounth) {
            case(1):
            case(3):
            case(5):
            case(7):
            case(8):
            case(10):
            case(12):
                System.out.println("В месяце 31 день");
                break;
            case(4):
            case(6):
            case(9):
            case(11):
                System.out.println("В месяце 30 дней");
                break;
            case(2):
                System.out.println("В месяце 28 дней");
                break;
            default:
                System.out.println("В году всего 12 месяцев");
                break;
        }
    }

    public static void main(String[] args) {
        Month.days(1);
        Month.days(2);
        Month.days(4);
        Month.days(13);
    }
}
