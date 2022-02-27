package ru.oca.lession04;

public class Student {
    int idNumber;
    String name;
    String firstName;
    int yearStudy;
    int averageMathematics;
    int averageEconomics;
    int averageEnglish;

    boolean StudentResult(int idNumber, String name, String firstName, int yearStudy) {
        this.idNumber = idNumber;
        this.name = name;
        this.firstName = firstName;
        this.yearStudy = yearStudy;
        System.out.println("Arithmetic mean " + this.name + " " + this.firstName + ": ");
        return true;
    }

    int StudentResult(int averageMathematics, int averageEconomics, int averageEnglish) {
        this.averageMathematics = averageMathematics;
        this.averageEconomics = averageEconomics;
        this.averageEnglish = averageEnglish;
        int average = (averageMathematics + averageEconomics + averageEnglish) / 3;
        System.out.println(average);
        return average;
    }
}
