package com.company;

public class Main {

    public static void main(String[] args) {
        // PRIMITIVE VARIABLE TYPES:
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is the addition of myString.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2015";
        System.out.println("myString is equal to " + myString);

        String numberString = "50.35";
        numberString = numberString + "40.22";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("last string is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("last string is equal to " + lastString);

    }
}
