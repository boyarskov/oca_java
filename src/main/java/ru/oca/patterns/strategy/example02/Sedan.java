package ru.oca.patterns.strategy.example02;

public class Sedan extends Auto {

    public Sedan() {
        this.fillStrategy = new StandartFillStrategy();
    }
}