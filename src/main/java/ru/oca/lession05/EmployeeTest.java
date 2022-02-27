package ru.oca.lession05;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.Employee(1, "Max", 23, 30000, "Devops");
        employee1.getSalary();
        employee1.salaryX2();
        System.out.println();
        Employee employee2 = new Employee();
        employee2.Employee(2, "Elena", 45, 95452, "Finance");
        employee2.getSalary();
        employee2.salaryX2();
    }
}
