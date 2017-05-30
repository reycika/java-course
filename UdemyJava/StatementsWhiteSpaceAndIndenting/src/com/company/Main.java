package com.company;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50; // myVariable = 50; is an expression; int myVariable = 50; is statement
        myVariable++; // this is statement
        myVariable--; // this is also statement
        System.out.println("This is a test"); // this is a statement

        // These two statements are equivalent
        System.out.println("This is" +
                    " another" +
                    " still more.");

        System.out.println("This is" + " another" + " still more.");

        int anotherValue = 50; anotherValue--; System.out.println("This is another one. " + anotherValue);
    }
}
