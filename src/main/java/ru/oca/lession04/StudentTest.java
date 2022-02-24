package ru.oca.lession04;

public class StudentTest {
    static Student MarkPetrov = new Student();
    static Student GlebPopov = new Student();
    static Student NastyaBoyarskova = new Student();

    public static void main(String[] args) {
        MarkPetrov.StudentResult(90, "Mark", "Petrov",
                1990, 5, 3, 4);
        GlebPopov.StudentResult(93, "Gleb", "Popov",
                1995, 3, 3, 2);
        NastyaBoyarskova.StudentResult(99, "Nastya", "Boyarskova",
                2015, 5, 5, 4);


    }

}
