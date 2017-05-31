package com.company;

public class Main {

    public static void main(String[] args) {
        int value = 45;
        if (value == 1) {
            System.out.println("Value was 1.");
        } else if (value == 2) {
            System.out.println("Value was 2.");
        } else {
            System.out.println("Value was not 1 nor 2.");
        }

        // if you forget the 'break', the code will keep executing until it finds another break
        // unless if there is no 'break' at the last line of switch statement
        int switchValue = 3;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1.");
                break;

            case 2:
                System.out.println("Value was 2.");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was 3, 4 or 5.");
                System.out.println("Actually it was " + switchValue + ".");
                break;

            default:
                System.out.println("Value was not 1 nor 2.");
                break;
        }

        System.out.println("----------------------------------");
        System.out.println("TASK 8");
        System.out.println("----------------------------------");

        // Create a new switch statement using char instead of int
        // Create a new char variable
        // Create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char newChar = 'E';

        switch (newChar) {
            case 'A':
                System.out.println("We found A");
                break;

            case 'B':
                System.out.println("We found B");
                break;

            case 'C': case 'D': case 'E':
                System.out.println("We found " + newChar);
                break;

            default:
                System.out.println("Not found A, B, C, D or E!!");
                break;
        }

        String month = "january";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
                break;

        }
    }
}
