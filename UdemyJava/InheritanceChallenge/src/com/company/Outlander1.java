package com.company;

/**
 * Created by renata on 01-Jun-17.
 */
public class Outlander1 extends Car1 {

    private int roadServiceMonths;

    public Outlander1(int roadServiceMonths) {
        super("Outlander1", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 30) {
            changeGear(1);
        } else if (newVelocity > 30 && newVelocity <= 50) {
            changeGear(3);
        } else if (newVelocity > 50 && newVelocity <= 80) {
            changeGear(4);
        } else if (newVelocity > 80 && newVelocity <= 130) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
