package com.company;

/**
 * Created by renata on 01-Jun-17.
 */
public class CarAccessories extends Car {

    private boolean airCondition;

    public CarAccessories(int seats, String drive, int weight, String name, String model, int gears, int topSpeed, boolean airCondition) {
        super(seats, drive, weight, name, model, gears, topSpeed);
        this.airCondition = airCondition;
    }

    public boolean isAirCondition() {
        return airCondition;
    }
}
