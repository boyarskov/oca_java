package ru.oca.lession012;

public class Student {

    public String name;
    public int course;
    public double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap(Student s1, Student s2) {
        s1.name = "Petr";
        s2.name = "Ivan";

    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Petr", 1, 5.3);
        swap(st1, st2);
        System.out.println(st1.name);
        System.out.println(st2.name);
    }
}
