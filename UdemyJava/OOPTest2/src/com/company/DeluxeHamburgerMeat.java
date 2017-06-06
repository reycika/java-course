package com.company;

public class DeluxeHamburgerMeat extends HamburgerMeat{

    private boolean chicken;
    private boolean pork;
    private boolean fish;
    private boolean beef;

    public DeluxeHamburgerMeat(boolean chicken, boolean pork, boolean fish, boolean beef) {
        super(chicken, pork, fish, beef);
    }

    // METHODS

    public void choose() {
        super.choose();
    }

    public boolean isChicken() {
        return chicken;
    }

    public boolean isPork() {
        return pork;
    }

    public boolean isFish() {
        return fish;
    }

    public boolean isBeef() {
        return beef;
    }
}
