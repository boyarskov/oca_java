package ru.oca.lession07;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee(int id) {
        this.id = id;
    }

    Employee(String surname) {
        this.surname = surname;
    }

    private Employee (double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        System.out.println("Salary: " + salary);
        return salary;
    }

    public String getSurname() {
        System.out.println("Surname: " + surname);
        return surname;
    }

    public int getId() {
        System.out.println("ID: " + id);
        return id;
    }

}
