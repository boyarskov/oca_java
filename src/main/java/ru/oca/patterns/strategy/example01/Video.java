package ru.oca.patterns.strategy.example01;

import java.util.logging.Logger;

public class Video implements ComputerStrategy {
    private static final Logger LOGGER = Logger.getLogger(Video.class.getName());

    @Override
    public void execute() {
        LOGGER.info("Video playing");
    }
}
