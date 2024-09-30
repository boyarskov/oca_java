package ru.oca.oop;

import java.util.concurrent.ThreadLocalRandom;

public class FigureMath {


    public static void main(String[] args) {
        Figure[] figures = getFigures();
        double maxArea = figures[0].calculateArea();

        for (int i = 1; i < figures.length; i++) {
            double area = figures[i].calculateArea();

            if (area > maxArea) {
                maxArea = area;
            }
        }
        System.out.println("Max area is " + maxArea);
    }

    private static Figure[] getFigures() {
            Figure[] figures = new Figure[300];

            for (int i = 0; i < 100; i++) {
                figures[i] = new Rectangle(getRandomNumber(), getRandomNumber());
            }

            for (int i = 100; i < 200; i++) {
                figures[i] = new Circle(getRandomNumber());
            }

            for (int i = 200; i < 300; i++) {
                figures[i] = new Triangle(getRandomNumber(), getRandomNumber());
            }
        return figures;
    }

    private static double getRandomNumber() {
        return buildRandomNumber(0, 100);
    }

    private static double buildRandomNumber(double min, double max) {
        return  ThreadLocalRandom.current().nextDouble(min, max);
    }
}
