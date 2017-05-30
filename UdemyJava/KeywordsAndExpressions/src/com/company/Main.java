package com.company;

public class Main {

    // https://en.wikipedia.org/wiki/List_of_Java_keywords

    public static void main(String[] args) {
        // a mile is equal to 1.609344 kilometers
        double kilometers = (100 * 1.609344);
        int highScore = 50;
        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        // in the following code write down the expressions

        int score = 100; // this is an expression
        if (score > 99) { // inside of if statement is an expression
            System.out.println("You got the highscore"); // inside of System.out.println is an expression
            score = 0; // this is an expression
        }
    }
}
