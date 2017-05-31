package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // if only one line inside if statement, you can do it without brackets
        /*if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000, but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }*/

        // inside of if code block is called scope
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

        // you can't reuse variables initialized in if statement


        System.out.println("---------------------------------------------");
        System.out.println("TASK 5");
        System.out.println("---------------------------------------------");

        // Print out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well.

        boolean newGameOver = true;
        int secondScore = 10_000;
        int secondLevelCompleted = 8;
        int secondBonus = 200;
        if (newGameOver) {
            int finalScore = secondScore + (secondLevelCompleted * secondBonus);
            System.out.println("Your finals score was " + finalScore);
        }

        // or we could just reuse (rewrite) the original variables. Be careful when copy/paste, not a good practice!
        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}
