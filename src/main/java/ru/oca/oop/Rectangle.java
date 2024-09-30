package ru.oca.oop;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width < 0 || height < 0) {
            return;
        }

        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }
}
