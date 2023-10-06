package ru.oca.lession04;

public class StudentTest {


    public static void main(String[] args) {
        Student MarkPetrov = new Student();
        MarkPetrov.idNumber = 1;
        MarkPetrov.name = "Mark";
        MarkPetrov.firstName = "Petrov";
        MarkPetrov.yearStudy = 2020;
        MarkPetrov.mathematicsScore = 4;
        MarkPetrov.economicsScore = 5;
        MarkPetrov.englishScore = 3;
        MarkPetrov.averageScore();

        Student GlebPopov = new Student(90, "Mark", "Petrov",1990);
        GlebPopov.mathematicsScore = 3;
        GlebPopov.economicsScore = 3;
        GlebPopov.englishScore = 4;
        GlebPopov.averageScore();

        Student NastyaBoyarskova = new Student(93, "Gleb", "Popov",
                1995, 5, 3, 4);
        NastyaBoyarskova.averageScore();
    }

}
