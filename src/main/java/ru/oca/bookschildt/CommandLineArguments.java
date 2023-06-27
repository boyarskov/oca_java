package ru.oca.bookschildt;

public class CommandLineArguments {
    public static void main(String[] args) {
        String carsNumbers[][] = {
                {"у188уу52", "Skoda Rapid"},
                {"т688ук152", "Ford Focus"},
                {"а001аа52", "Mercedes-Benz S-class"},
                {"о001оо52", "Лада Нива"}
        };
        if (args.length < 1) {
            System.out.println("Введите <номер> или <номера> автомобилей");
        } else {
            for (int j = 0; j < args.length; j++) {
                for (int i = 0; i < carsNumbers.length; i++) {
                    if (carsNumbers[i][0].equals(args[j])) {
                        System.out.println("Госномер " + carsNumbers[i][0] + " установлен на: " + carsNumbers[i][1]);
                        break;
                }
            }
            }
        }
    }
}
