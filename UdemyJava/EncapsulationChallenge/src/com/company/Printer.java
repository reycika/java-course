package com.company;

/**
 * Created by Reycika on 5.6.2017.at 17:15
 */
public class Printer {

    private int tonerLevel;
    private int printPages;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.printPages = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public int fillTheToner(int percentage) {
        if (percentage > 0 && percentage <= 100) {
            if (this.tonerLevel + percentage > 100) {
                return -1;
            }
            this.tonerLevel += percentage;
            System.out.println("After filling up the toner by " + percentage + "%, the Toner Level is " + tonerLevel + "%");
            return this.tonerLevel;
            }
        else {
            return -1;
        }
    }

    public int print(int howManyPagesToPrint) {
        int pagesToPrint = howManyPagesToPrint;

        if (this.duplexPrinter) {
            System.out.println("Printing in duplex mode");
            if (pagesToPrint % 2 == 1) {
                return this.printPages += pagesToPrint/2 + 1;
            } else {
                return this.printPages += pagesToPrint/2;
            }
        }
        this.printPages += pagesToPrint;
        return pagesToPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPrintPages() {
        return printPages;
    }
}
