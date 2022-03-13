package ru.oca.lession11;

public class Car {
    String color;
    String engine;
    int doors;

    public Car(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }
}

class CarTest {
    void changeDoor(int doors, Car count) {
        count.doors = doors;
    }

    void changeColor(Car c1, Car c2) {
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car1 = new Car("red", "w12", 5);
        Car car2 = new Car("blue", "v8", 3);
        ct.changeDoor(3,car1);
        ct.changeColor(car1, car2);
        System.out.println("Car 1. Color: " + car1.color + " Engine: " + car1.engine + " Doors: " + car1.doors);
        System.out.println("Car 2. Color: " + car2.color + " Engine: " + car2.engine + " Doors: " + car2.doors);
    }
}
