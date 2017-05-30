package com.company;

public class Main {

    public static void main(String[] args) {

        // char has width of 16 (2 bytes)
        char myChar = '1';
        char myChar2 = 'b';
        char myChar3 = '?';
        char myChar4 = 'A';
        char myChar5 = ' ';

        // from https://unicode-table.com/en/#basic-latin - Unicode character
        char myChar6 = '\u00A9';
        System.out.println("Unicode character = " + myChar6);

        boolean kaliIsHuman = false;
        boolean renataIsFemale = true;

        System.out.println("----------------------------------------------------------");
        System.out.println("TASK 3: Find the Unicode character for 'registered' symbol");
        System.out.println("----------------------------------------------------------");

        // 1. Find the code for the registered symbol on the same line as the copyright symbol.
        // 2. Create a variable of type char and assign it the unicode value for that symbol.
        // 3. Display it on the screen.

        char registeredSymbol = '\u00AE';
        System.out.println("Unicode for 'registered' symbol = " + registeredSymbol);

        /*String regSymb = "\u00AE";
        System.out.println(regSymb);*/

    }
}
