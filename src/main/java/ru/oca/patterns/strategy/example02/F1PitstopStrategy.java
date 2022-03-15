package ru.oca.patterns.strategy.example02;

public class F1PitstopStrategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Заправляем бензином или электричеством на выбор!");
    }
}