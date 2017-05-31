package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is: " + count);
            count++;
        }

        System.out.println("-------------------------------------");

        count = 1;
        while(true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is: " + count);
            count++;
        }

        System.out.println("-------------------------------------");

        count = 1;
        do {
            System.out.println("Count value is: " + count);
            count++;
        } while (count != 6);

        System.out.println("-------------------------------------");
        System.out.println("TASK 10a");
        System.out.println("-------------------------------------");

        // Create a method called isEvenNumber that takes the parameter of type int
        // Its purpose is to determine if the argument passed to the method
        // is an even number or not
        // return true if an even number, else return false

        int i = 1;
        while (i <= 100) {
            if (isEvenNumber(i)) {
                System.out.println("Number " + i + " is an even number.");
                i++;
            } else {
                i++;
            }
        }

        System.out.println("-------------------------------------");

        int startNumber = 5;
        int finishNumber = 20;
        while (startNumber <= finishNumber) {
            if (!isEvenNumber(startNumber)) {
                startNumber++;
                continue;
            }
            System.out.println("Number " + startNumber + " is an even number.");
            startNumber++;
        }

        System.out.println("-------------------------------------");
        System.out.println("TASK 10b");
        System.out.println("-------------------------------------");

        // Modify the while loop.
        // Record the total number of even numbers found.
        // Break once 5 numbers are found.
        // Display the total number of even numbers found.

        startNumber = 5;
        finishNumber = 20;
        int numberOfEvenNumbers = 0;
        while (startNumber <= finishNumber) {
            if (!isEvenNumber(startNumber)) {
                startNumber++;
                continue;
            }
            System.out.println("Number " + startNumber + " is an even number.");
            startNumber++;
            numberOfEvenNumbers++;
            if (numberOfEvenNumbers == 5) {
                System.out.println("We found " + numberOfEvenNumbers + " even numbers, " +
                        "we are exiting the loop");
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

}
