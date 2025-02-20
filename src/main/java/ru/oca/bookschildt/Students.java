package ru.oca.bookschildt;

import java.util.ArrayList;
import java.util.List;

public class Students {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Artem", 30, 4.2));
        students.add(new Student("Nastya", 24, 5.3));
        students.add(new Student("Max", 33, 3.4));
        System.out.println(getAverageAge(students));
        System.out.println(getStudentName(students, 3.5));
        System.out.println(students);
        delStudentName(students);
        System.out.println(students);
    }

    private static boolean listIsEmpty(List<Student> students) {
            return students == null || students.isEmpty();
    }

    private static double getAverageAge(List<Student> students) {
        double averageAge = 0;
        double commonAge = 0;

        if (listIsEmpty(students)) {
            System.out.println("List is empty");
            return averageAge;
        }

        for (Student student : students) {
            commonAge = commonAge + student.getAge();
        }

        averageAge = commonAge / students.size();

        return averageAge;
    }

    private static List<String> getStudentName(List<Student> students, double averageGrade) {
        List<String> names = new ArrayList<>();
        if (listIsEmpty(students)) {
            System.out.println("List is empty");
            return names;
        }

        for (Student student : students) {
            if (student.getAverageGrade() > averageGrade) {
                names.add(student.getName());
            }
        }

        return names;
    }

    private static void delStudentName(List <Student> students) {
        int index = 0;
        double minGrade = students.get(index).getAverageGrade();


        if (listIsEmpty(students)) {
            System.out.println("List is empty");
            return;
        }

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverageGrade() < minGrade) {
                minGrade = students.get(i).getAverageGrade();
                index = i;
            }
        }
        students.remove(index);
    }


}
