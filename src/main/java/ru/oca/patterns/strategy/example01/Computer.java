package ru.oca.patterns.strategy.example01;

public class Computer {
    private ComputerStrategy strategy;

    public Computer(ComputerStrategy strategy) {
        this.strategy = strategy;
    }

    public void setNewTask(ComputerStrategy strategy) {
        this.strategy = strategy;
    }

    public void runTask() {
        this.strategy.execute();
    }
}
