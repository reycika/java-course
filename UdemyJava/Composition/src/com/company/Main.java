package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherBoard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherBoard);

        /*thePC.getMonitor().drawPixelAt(1500, 1200, "red");
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();*/

        thePC.powerUp();

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("TASK");
        System.out.println("--------------------------------------------------------------------------");

        Furniture furniture = new Furniture(true, true, true, false, true);

        Room bedroom = new Room(5, furniture, 2, true);

        bedroom.insertToRoom("closet");
        boolean isThereAnItem = bedroom.getFurniture().isCouch();
        System.out.println(isThereAnItem);

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("TASK - TEACHER'S SOLUTION");
        System.out.println("--------------------------------------------------------------------------");

        WallTeacher wall1 = new WallTeacher("west");
        WallTeacher wall2 = new WallTeacher("east");
        WallTeacher wall3 = new WallTeacher("north");
        WallTeacher wall4 = new WallTeacher("south");

        CeilingTeacher ceiling = new CeilingTeacher(12,55);

        BedTeacher bed = new BedTeacher("Modern", 4, 3, 2, 1);

        LampTeacher lamp = new LampTeacher("Classic", false, 75);

        BedroomTeacher myBedroom = new BedroomTeacher("Renata's", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        myBedroom.makeBed();
        myBedroom.getLamp().turnOn();

    }
}