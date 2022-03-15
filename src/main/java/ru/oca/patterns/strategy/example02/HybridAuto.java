package ru.oca.patterns.strategy.example02;

public class HybridAuto extends Auto {

    public HybridAuto() {
        this.fillStrategy = new HybridFillStrategy();
    }
}
