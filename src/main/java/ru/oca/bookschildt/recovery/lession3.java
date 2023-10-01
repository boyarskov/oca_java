package ru.oca.bookschildt.recovery;

public class lession3 {
    int studyTicket;
    String firstName;
    String lastName;
    int year;
    int resultMath;
    int resultEconomy;
    int resultEnglish;
    int average;

    lession3(int studyTicket, String firstName, String lastName, int year) {
        studyTicket = this.studyTicket;
        firstName = this.firstName;
        lastName = this.lastName;
        year = this.year;
    }

    int StudentResult(int resultMath, int resultEconomy, int resultEnglish) {
        average = (resultMath + resultEconomy + resultEnglish) / 3;
        System.out.println("Средний балл за 3 предмета: " + average);
        return average;
    }
}
