package ru.oca.lession07;

public class Modifier {
    public static void main(String[] args) {
        Employee test = new Employee(5);
        Employee test2 = new Employee("Ivanov");

        System.out.println(test.id);
        System.out.println(test2.surname);
    }
}
