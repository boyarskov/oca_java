package ru.oca.lession05;

public class Employee {
    public int id;
    public String surname;
    public int age;
    public int salary;
    public String department;

    boolean Employee(int id, String surname, int age, int salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
        return true;
    }

    int getSalary() {
        System.out.println("Salary " + surname + ": " + salary);
        return salary;
    }

    int salaryX2() {
        salary *= 2;
        System.out.println("New salary " + surname + ": " + salary);
        return salary;
    }

}