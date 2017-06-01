package com.company;

/**
 * Created by renata on 01-Jun-17.
 */
public class Car1 extends Vehicle1 {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car1(String name, String size, int wheels, int doors, int gears,
                boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car1.changeVelocity(): velocity " + speed + " direction " + direction);
        move(speed, direction);
    }


}
