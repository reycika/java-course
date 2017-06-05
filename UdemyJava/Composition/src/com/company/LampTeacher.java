package com.company;

/**
 * Created by Reycika on 5.6.2017.at 16:24
 */
public class LampTeacher {
    private String style;
    private boolean battery;
    private int globalRating;

    public LampTeacher(String style, boolean battery, int globalRating) {
        this.style = style;
        this.battery = battery;
        this.globalRating = globalRating;
    }

    public void turnOn() {
        System.out.println("Turning on the lamp...");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobalRating() {
        return globalRating;
    }
}
