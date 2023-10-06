package ru.oca.lession04;

public class Student {
    int idNumber;
    String name;
    String firstName;
    int yearStudy;
    int mathematicsScore;
    int economicsScore;
    int englishScore;

    Student(int idNumber1, String name1, String firstName1, int yearStudy1, int mathematicsScore1, int economicsScore1, int englishScore1) {
        idNumber = idNumber1;
        name = name1;
        firstName = firstName1;
        yearStudy = yearStudy1;
        mathematicsScore = mathematicsScore1;
        economicsScore = economicsScore1;
        englishScore = englishScore1;
    }

    Student(int idNumber2, String name2, String firstName2, int yearStudy2) {
        this(idNumber2, name2, firstName2, yearStudy2, 0, 0, 0);
    }

    Student() {

    }

    int averageScore() {
        int averageScore = (mathematicsScore + economicsScore + englishScore) / 3;
        System.out.println(firstName + " Average Score: " + averageScore);
        return averageScore;
    }


}
