package com.company;

/**
 * Created by Reycika on 5.6.2017.at 16:20
 */
public class BedTeacher {

    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public BedTeacher(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make() {
        System.out.println("make() called -> making bed...");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
