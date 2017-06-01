package com.company;

/**
 * Created by renata on 01-Jun-17.
 */
public class Car extends Vehicle {

    private String name;
    private String model;
    private int gears;
    private int topSpeed;


    public Car(int seats, String drive, int weight, String name, String model, int gears, int topSpeed) {
        super("Car", seats, drive, weight);
        this.name = name;
        this.model = model;
        this.gears = gears;
        this.topSpeed = topSpeed;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public void setDrive(String drive) {
        String validDrive = drive.toLowerCase();
        if (validDrive.equals("fuel") || validDrive.equals("electric")) {
            this.drive = drive;
        } else {
            this.drive = "Unknown drive type";
        }
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        switch (gears) {
            case 1:
                System.out.println("Car is driving in 1st gear.");
                break;
            case 2:
                System.out.println("Car is driving in 2nd gear.");
                break;
            case 3:
                System.out.println("Car is driving in 3rd gear.");
                break;
            case 4: case 5: case 6:
                System.out.println("Car is driving in " + gears + "th gear.");
                break;
            case -1:
                System.out.println("Car is driving in reverse.");
                break;
            default:
                System.out.println("Car can drive only in gears from 1 to 6, or -1 if it's going in reverse");
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }
}
