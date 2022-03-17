package ru.oca.lession012;

public class StudentTest {

    public static void method1(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Студенты равны");
        } else {
            System.out.println("Студенты не равны");
        }
    }

    public static void method2(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Имена студентов, их курсы и оценки одинаковые");
                } else {
                    System.out.println("Имена студентов, их курсы одинаковые, но оценки разные");
                }
            } else {
                System.out.println("Имена студентов одинаковые, но их курсы и оценки разные");
            }
        } else {
            System.out.println("Имена студентов разные");
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3, 9.5);
        Student st2 = new Student("Ivan", 3, 5.3);
        method1(st1, st2);
        method2(st1, st2);
    }
}
