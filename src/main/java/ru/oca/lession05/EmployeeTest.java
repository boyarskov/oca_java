package ru.oca.lession05;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee user1 = new Employee(1, "Maria", 23, 53578, "IT");
        Employee user2 = new Employee(2, "Ivan", 33, 70000, "Marketing");

        System.out.println(user1.surname + " new salary: " + user1.salaryX2());
        System.out.println(user2.surname + " new salary: " + user2.salaryX2());
    }
}
