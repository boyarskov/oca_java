package ru.oca.patterns.strategy.example01;

import java.util.logging.Logger;

public class Game  implements ComputerStrategy {
    private static final Logger LOGGER = Logger.getLogger(Game.class.getName());

    @Override
    public void execute() {
        LOGGER.info("Gaming now");
    }
}
