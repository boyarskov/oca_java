package ru.oca.patterns.strategy.example02;

public class F1Car extends Auto {

    public F1Car() {
        this.fillStrategy = new F1PitstopStrategy();
    }
}