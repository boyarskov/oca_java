package ru.oca.oop;

public class Triangle extends Figure {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        if (base < 0 || height < 0) {
            return;
        }

        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (height * base) / 3;
    }
}
