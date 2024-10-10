package ru.oca.oop.exampleabstract.race;

import ru.oca.oop.exampleabstract.transport.Bike;
import ru.oca.oop.exampleabstract.transport.Cars;
import ru.oca.oop.exampleabstract.transport.Truck;

public class TransportRace {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Cars car = new Cars();
        Truck truck = new Truck();

        int countNails = 100;
        int countTransport = 1000;

        int countFinishedBikes = 0;
        for (int i = 0; i < countTransport; i++) {
            if (bike.isAbleDriveRoad(countNails)) {
                countFinishedBikes++;
            }
        }

        int countFinishedCars = 0;
        for (int i = 0; i < countTransport; i++) {
            if (car.isAbleDriveRoad(countNails)) {
                countFinishedCars++;
            }
        }

        int countFinishedTruck = 0;
        for (int i = 0; i < countTransport; i++) {
            if (truck.isAbleDriveRoad(countNails)) {
                countFinishedTruck++;
            }
        }

        System.out.println("Кол-во финишировавших велосипедов: " + countFinishedBikes);
        System.out.println("Кол-во финишировавших автомобилей: " + countFinishedCars);
        System.out.println("Кол-во финишировавших грузовиков: " + countFinishedTruck);
    }
}
