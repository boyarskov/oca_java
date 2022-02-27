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

/*
Создайте класс Employee с атрибутами id, surname, age, salary, department,
которые должны задаваться в конструкторе. В данном классе также создайте метод увеличения
зар платы вдвое. Создайте второй класс EmployeeTest, в котором создайте 2 объекта класса Employee.
 Увеличте зарплату каждому работнику вдвое с помощью метода и выведите на экран значение новой зп
 */