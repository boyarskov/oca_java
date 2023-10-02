package ru.oca.lession05;

public class Employee {
    int id;
    String surname;
    int age;
    int salary;
    String department;

    public Employee(int id1, String surname1, int age1, int salary1, String department1) {
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        department = department1;
    }

    int salaryX2() {
        salary *= 2;
        return salary;
    }

}
