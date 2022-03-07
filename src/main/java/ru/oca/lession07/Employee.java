package ru.oca.lession07;

public class Employee {
    int id;
    public String surname;
    int age;
    private int salary;
    String department;

    boolean Employee(int id, String surname, int age, int salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
        return true;
    }

    public boolean Employee(int id, String surname, int salary) {
        this.id = id;
        this.surname = surname;
        this.salary = salary;
        System.out.println("Salary: " + salary);
        System.out.println("Surname: " + surname);
        System.out.println("ID: " + id);
        return true;
    }

    private boolean Employee2(int id, String surname, int salary) {
        this.id = id;
        this.surname = surname;
        this.salary = salary;
        System.out.println("Salary: " + salary);
        System.out.println("Surname: " + surname);
        System.out.println("ID: " + id);
        return true;
    }

    boolean Employee3(int id, String surname, int salary) {
        this.id = id;
        this.surname = surname;
        this.salary = salary;
        System.out.println("Salary: " + salary);
        System.out.println("Surname: " + surname);
        System.out.println("ID: " + id);
        return true;
    }

    public int getSalary() {
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

    int salaryX2() {
        salary *= 2;
        System.out.println("New salary " + surname + ": " + salary);
        return salary;
    }

}
