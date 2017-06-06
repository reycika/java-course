package com.company;

public class Hamburger {

    private HamburgerMeat meatType;
    private HamburgerBread breadType;
    private HamburgerAdditions additions;


    public Hamburger(HamburgerMeat meatType, HamburgerBread breadType, HamburgerAdditions additions) {
        this.meatType = meatType;
        this.breadType = breadType;
        this.additions = additions;
    }

    public void createHamburger() {
        meatType.choose();
        breadType.choose();
        System.out.println("Additions: ");
        additions.choose();
    }

    public HamburgerMeat getMeatType() {
        return meatType;
    }

    public HamburgerBread getBreadType() {
        return breadType;
    }

    public HamburgerAdditions getAdditions() {
        return additions;
    }
}
