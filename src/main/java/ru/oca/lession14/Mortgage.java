package ru.oca.lession14;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int years = 0;
        while (amount > 0) {
            amount += amount * percent / 100 - salary;
            years++;
        }
        System.out.println(years);
        return years;
    }

    public static void main(String[] args) {
        year(100, 120, 50);
    }
}
