package com.company;

public class HealthyHamburgerMeat {

    private boolean chicken;
    private boolean fish;
    private boolean beef;

    public HealthyHamburgerMeat(boolean chicken, boolean fish, boolean beef) {
        this.chicken = chicken;
        this.fish = fish;
        this.beef = beef;
    }

    // METHODS

    public void choose() {
        int itemsSelected = 0;
        String meatType = "";
        if (this.chicken) {
            itemsSelected++;
            meatType = "Chicken";
        }

        if (this.fish) {
            itemsSelected++;
            meatType = "Fish";
        }

        if (this.beef) {
            itemsSelected++;
            meatType = "Beef";
        }

        if (itemsSelected == 0) {
            System.out.println("Meat: You haven't selected any meat. Choose one for your hamburger.");
        } else if (itemsSelected > 1) {
            System.out.println("Meat: You cannot select more than 1 type of meat.");
        } else {
            System.out.println("Meat: " + meatType);
        }
    }

    public boolean isChicken() {
        return chicken;
    }

    public boolean isFish() {
        return fish;
    }

    public boolean isBeef() {
        return beef;
    }
}
