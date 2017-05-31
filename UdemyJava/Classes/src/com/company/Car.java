package com.company;

public class Car {

    // fields - characteristics of a car
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        // we can define model only for some car models
        if (validModel.equals("carrera") || validModel.equals("megane")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }

        // or we can just do: this.model = model, and it's valid for every entry

    }

    public String getModel() {
        return this.model;
    }
}
