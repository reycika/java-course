package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Renata", 500);
        System.out.println("New score is " + newScore);

        newScore = calculateScore(200);
        System.out.println("New score is " + newScore);

        calculateScore(75);

        calculateScore();

        // Create a method called calcFeetAndInchesToCentimeters
        // It needs to have 2 parameters
        // feet is the first parameter, inch is the second
        //
        // You should validate that the first parameter feet is >= 0
        // You should validate that the second parameter inches is >= 0 and <= 12
        // return -1 if either of above is not true
        //
        // If the parameters are valid, then calculate how many centimetres
        // comprise the feet and inches passed to this method and return that value.
        //
        // Create a 2nd method of the same name but with only one parameter
        // inches is the parameter
        // validate that it's >= 0
        // return -1 if it is not true
        // if it is valid, then calculate how many feet are in the inches
        // and then here is the tricky part
        // call the other overloaded method passing the correct feet and inches calculated so that it can calculate correctly
        // hints: use double for your number data types is probably a good idea
        // 1 inch = 2.54cm and one foot = 12 inches
        // use the link http://www.metric-conversions.org/length/feet-to-centimeters.htm to confirm your code is calculating correctly.
        // Calling another overloaded method just requires you to use the right number of parameters.

        System.out.println("--------------------------------------------------------------------");
        System.out.println("TASK 7");
        System.out.println("--------------------------------------------------------------------");

        double result = calcFeetAndInchesToCentimeters(7, 5);
        System.out.println(result);

        result = calcFeetAndInchesToCentimeters(13);
        System.out.println(result);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        } else {
            double feetInchesToCentimeters = feet * 30.48 + inches * 2.54;
            System.out.println("Feet " + feet + ", inches " + inches + " is " + feetInchesToCentimeters + " cm");
            return feetInchesToCentimeters;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        } else {
            double inchToFeet = (inches / 12);
            double feetToCentimeters = inchToFeet * 30.48;
            return feetToCentimeters;
        }
    }

    // Method overloading - create more methods with same name, but different number of input parameters to make it unique

    public static int calculateScore(String player, int score) {
        System.out.println("Player " + player + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static void calculateScore() {
        System.out.println("No player name, no player score");
    }
}
