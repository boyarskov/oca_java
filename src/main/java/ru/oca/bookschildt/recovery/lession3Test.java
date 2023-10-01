package ru.oca.bookschildt.recovery;

public class lession3Test {
    public static void main(String[] args) {
        lession3 Ivan = new lession3(1, "Ivan", "Jordan", 1996);
        lession3 Petr = new lession3(2, "Petr", "Brain", 1995);
        lession3 Maria = new lession3(3, "Maria", "Olov", 1993);

        int IvanAverage = Ivan.StudentResult(4, 3, 3);
        int PetrAverage = Petr.StudentResult(3, 3, 5);
        int MariaAverage = Maria.StudentResult(5, 4, 4);

        if (IvanAverage > PetrAverage && IvanAverage > MariaAverage) {
            System.out.println("Ivan win");
        } else if (PetrAverage > IvanAverage && PetrAverage > MariaAverage) {
            System.out.println("Petr win");
        } else if (MariaAverage > IvanAverage && MariaAverage > PetrAverage) {
            System.out.println("Maria win");
        }
    }
}
