package ru.oca.lession08;

public class Square {
    public final static double pi = 3.14;

    public double squareCircle(double radius) {
        double square = pi * radius * radius;
        return square;
    }

    public static double circumference(double radius) {
        double circumference = 2 * pi * radius;
        return circumference;
    }

    public void showRsl(double radius) {
        System.out.println("Радиус = " + radius);
        System.out.println("Площадь круга = " + squareCircle(radius));
        System.out.println("Длина окружности = " + circumference(radius));
    }

        public static void main(String[] args) {
            Square z = new Square();
            z.squareCircle(5);
            Square.circumference(2);
            z.showRsl(4);
        }
    }
