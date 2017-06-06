package com.company;

public class HamburgerBread {

    private boolean whiteRoll;
    private boolean sesameRoll;
    private boolean cornRoll;

    public HamburgerBread(boolean whiteRoll, boolean sesameRoll, boolean cornRoll) {
        this.whiteRoll = whiteRoll;
        this.sesameRoll = sesameRoll;
        this.cornRoll = cornRoll;
    }

    // METHODS

    public void choose() {
        int itemsSelected = 0;
        String breadType = "";
        if (this.whiteRoll) {
            itemsSelected++;
            breadType = "White roll";
        }

        if (this.sesameRoll) {
            itemsSelected++;
            breadType = "Sesame roll";
        }

        if (this.cornRoll) {
            itemsSelected++;
            breadType = "Corn roll";
        }

        if (itemsSelected == 0) {
            System.out.println("Bread: You haven't selected any bread roll. Choose one for your hamburger.");
        } else if (itemsSelected > 1) {
            System.out.println("Bread: You cannot select more than 1 bread roll.");
        } else {
            System.out.println("Bread: " + breadType);
        }
    }

    // GETTERS
    public boolean isWhiteRoll() {
        return whiteRoll;
    }

    public boolean isSesameRoll() {
        return sesameRoll;
    }

    public boolean isCornRoll() {
        return cornRoll;
    }
}
