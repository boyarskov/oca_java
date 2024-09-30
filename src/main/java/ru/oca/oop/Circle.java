package ru.oca.oop;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            return;
        }

        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }
}
