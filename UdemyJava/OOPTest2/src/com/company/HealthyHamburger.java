package com.company;

public class HealthyHamburger {

    private String bread;
    private HealthyHamburgerMeat meat;
    private HealthyHamburgerAdditions additions;
    private double healthyHamburgerPrice;


    public HealthyHamburger(HealthyHamburgerMeat meat, HealthyHamburgerAdditions additions) {
        this.bread = "Bread: Brown rye bread roll";
        this.meat = meat;
        this.additions = additions;
        this.healthyHamburgerPrice = 4.0;
    }

    public void createHealthyHamburger() {
        meat.choose();
        System.out.println(getBread());
        additions.choose();
        getHealthyHamburgerPrice();
    }

    public String getBread() {
        return bread;
    }

    public HealthyHamburgerMeat getMeat() {
        return meat;
    }

    public HealthyHamburgerAdditions getAdditions() {
        return additions;
    }

    public double getHealthyHamburgerPrice() {
        return healthyHamburgerPrice;
    }
}