package ru.oca.lession04;

public class Student {
    int idNumber;
    String name;
    String firstName;
    int yearStudy;
    int averageMathematics;
    int averageEconomics;
    int averageEnglish;

    boolean StudentResult(int idNumber, String name, String firstName, int yearStudy, int averageMathematics, int averageEconomics, int averageEnglish) {
        this.idNumber = idNumber;
        this.name = name;
        this.firstName = firstName;
        this.yearStudy = yearStudy;
        this.averageMathematics = averageMathematics;
        this.averageEconomics = averageEconomics;
        this.averageEnglish = averageEnglish;
        System.out.println("Arithmetic mean " + this.name + " " + this.firstName + ": " + (this.averageEconomics + this.averageEnglish + this.averageMathematics) / 3);
        return true;
    }
}
