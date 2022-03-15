package ru.oca.patterns.strategy.example01;

import java.util.logging.Logger;

public class App {
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    private static void main(String[] args) {
        LOGGER.info("Switch on computer and play movie");
        Computer computer = new Computer(new Video());
        computer.runTask();

        LOGGER.info("Find music");
        computer.setNewTask(new Music());
        computer.runTask();

        LOGGER.info("Find game");
        computer.setNewTask(new Game());
        computer.runTask();

        Computer functionalComputer = new Computer(
                () -> LOGGER.info("Write program")
        );
        functionalComputer.runTask();

        functionalComputer = new Computer(
                () -> LOGGER.info("Execute some code and get some output")
        );
        functionalComputer.runTask();
    }
    }
