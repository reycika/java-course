package com.company;

public class DeluxeHamburger {

    private DeluxeHamburgerMeat meatType;
    private DeluxeHamburgerBread breadType;
    private boolean chips;
    private boolean drink;
    private double deluxeHamburgerPrice;

    public DeluxeHamburger(DeluxeHamburgerMeat meatType, DeluxeHamburgerBread breadType) {
        this.meatType = meatType;
        this.breadType = breadType;
        this.chips = true;
        this.drink = true;
        this.deluxeHamburgerPrice = 4.5;
    }

    public void createDeluxeHamburger() {
        meatType.choose();
        breadType.choose();
        System.out.println("Chips served");
        System.out.println("Drink served");
        System.out.println("-------------------------");
        System.out.println("TOTAL " + getDeluxeHamburgerPrice());
    }

    public DeluxeHamburgerMeat getMeatType() {
        return meatType;
    }

    public DeluxeHamburgerBread getBreadType() {
        return breadType;
    }

    public boolean isChips() {
        return chips;
    }

    public boolean isDrink() {
        return drink;
    }

    public double getDeluxeHamburgerPrice() {
        return deluxeHamburgerPrice;
    }
}
