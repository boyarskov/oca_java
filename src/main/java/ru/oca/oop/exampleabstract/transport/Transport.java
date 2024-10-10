package ru.oca.oop.exampleabstract.transport;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Transport {
    private int countWheels;

    public Transport(int countWheels) {
        this.countWheels = countWheels;
    }

    protected int getCountWheels() {
        return countWheels;
    }

    protected  abstract boolean isAbleDriveRoad(int countNails);

    protected  boolean isWheelBurst(int countPercent) {
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 100);
        return randomNumber <= countPercent;
    }

}
