package com.company;

public class DeluxeHamburgerBread extends HamburgerBread {

    private boolean whiteRoll;
    private boolean sesameRoll;
    private boolean cornRoll;

    public DeluxeHamburgerBread(boolean whiteRoll, boolean sesameRoll, boolean cornRoll) {
        super(whiteRoll, sesameRoll, cornRoll);
    }

    // METHODS

    public void choose() {
        super.choose();
    }

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
