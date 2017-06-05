package com.company;

/**
 * Created by renata on 05-Jun-17.
 */
public class Room {

    private int size;
    private Furniture furniture;
    private int windows;
    private boolean balcony;

    public Room(int size, Furniture furniture, int windows, boolean balcony) {
        this.size = size;
        this.furniture = furniture;
        this.windows = windows;
        this.balcony = balcony;
    }

    public void insertToRoom(String furnitureItem) {
        furniture.insertFurniture(furnitureItem);
        System.out.println("insertToRoom() called without getters.");
    }

    public int getSize() {
        return size;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public int getWindows() {
        return windows;
    }

    public boolean isBalcony() {
        return balcony;
    }
}