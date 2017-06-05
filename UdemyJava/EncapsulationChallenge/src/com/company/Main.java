package com.company;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50, true);

        System.out.println("Current Toner Level is " + printer.getTonerLevel() + "%");
        System.out.println("Initial page count " + printer.getPrintPages());

        //printer.fillTheToner(5);

        int printPage = 6;
        printer.print(printPage);
        System.out.println("Printed pages " + printPage + ", new total print count" +
                " for printer is " + printer.getPrintPages());

        printPage = 3;
        printer.print(printPage);
        System.out.println("Printed pages " + printPage + ", new total print count" +
                " for printer is " + printer.getPrintPages());
        
        printer.fillTheToner(40);
    }
}
