package ru.oca.oop.exampleabstract.transport;

public class Bike extends Transport {
    public Bike() {
        super(2);
    }

    @Override
    public boolean isAbleDriveRoad(int countNails) {
        int countPercent = 10;
        int countWholeWheels = getCountWheels();

        for (int i = 0; i < countNails; i++) {
            if (isWheelBurst(countPercent)) {
                countWholeWheels--;

                if (countWholeWheels == 0) {
                    return false;
                }
                countPercent -= 5;
            }
        }

        return true;
    }
}
