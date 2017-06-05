package com.company;

/**
 * Created by Reycika on 5.6.2017.at 14:21
 */
public class BedroomTeacher {

    private String name;
    private WallTeacher wall1;
    private WallTeacher wall2;
    private WallTeacher wall3;
    private WallTeacher wall4;
    private CeilingTeacher ceiling;
    private BedTeacher bed;
    private LampTeacher lamp;

    public BedroomTeacher(String name, WallTeacher wall1, WallTeacher wall2, WallTeacher wall3, WallTeacher wall4,
                          CeilingTeacher ceiling, BedTeacher bed, LampTeacher lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public LampTeacher getLamp() {
        return this.lamp;
    }

    public void makeBed() {
        System.out.println("Bedroom -> makeBed");
        bed.make();
    }
}
