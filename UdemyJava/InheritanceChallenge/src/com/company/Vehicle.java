package com.company;

/**
 * Created by renata on 01-Jun-17.
 */
public class Vehicle {

    private String type;
    private int seats;
    public String drive;
    private int weight;

    public Vehicle(String type, int seats, String drive, int weight) {
        this.type = type;
        this.seats = seats;
        this.drive = drive;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public String getDrive() {
        return drive;
    }

    public int getWeight() {
        return weight;
    }
}
