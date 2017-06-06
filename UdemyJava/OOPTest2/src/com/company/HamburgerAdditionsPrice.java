package com.company;

public class HamburgerAdditionsPrice {

    private double lettuce;
    private double tomato;
    private double pickles;
    private double carrot;
    private double onion;
    private double chilli;
    private double sauce;

    public HamburgerAdditionsPrice() {
        this.lettuce = 0.10;
        this.tomato = 0.30;
        this.pickles = 0.35;
        this.carrot = 0.20;
        this.onion = 0.25;
        this.chilli = 0.40;
        this.sauce = 0.50;
    }

    public double getLettuce() {
        return lettuce;
    }

    public double getTomato() {
        return tomato;
    }

    public double getPickles() {
        return pickles;
    }

    public double getCarrot() {
        return carrot;
    }

    public double getOnion() {
        return onion;
    }

    public double getChilli() {
        return chilli;
    }

    public double getSauce() {
        return sauce;
    }
}
