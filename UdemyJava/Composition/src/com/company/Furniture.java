package com.company;

/**
 * Created by renata on 05-Jun-17.
 */
public class Furniture {

    private boolean couch;
    private boolean tv;
    private boolean bed;
    private boolean mirror;
    private boolean desk;

    public Furniture(boolean couch, boolean tv, boolean bed, boolean mirror, boolean desk) {
        this.couch = couch;
        this.tv = tv;
        this.bed = bed;
        this.mirror = mirror;
        this.desk = desk;
    }

    public void insertFurniture(String furniture) {
        System.out.println("Adding " + furniture + " to the room.");
    }

    public boolean isCouch() {
        return couch;
    }

    public boolean isTv() {
        return tv;
    }

    public boolean isBed() {
        return bed;
    }

    public boolean isMirror() {
        return mirror;
    }

    public boolean isDesk() {
        return desk;
    }
}