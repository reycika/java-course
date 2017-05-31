package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

	    int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

	    highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        System.out.println("----------------------------------------------------");
        System.out.println("TASK 6");
        System.out.println("----------------------------------------------------");

        // Create a method called displayHighScorePosition
        // it should take a player's name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the player's name along with a message like "managed to get into position " and the
        // position they got and a further message "on the high score table."
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be send one argument only, the player's score
        // it should return an int
        // the return data should be
        // 1 if the score is > 1000
        // 2 if the score is > 500 and < 1000
        // 3 if the score is > 100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50

        int playerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Player1", playerPosition);

        playerPosition = calculateHighScorePosition(900);
        displayHighScorePosition("Player2", playerPosition);

        playerPosition = calculateHighScorePosition(400);
        displayHighScorePosition("Player3", playerPosition);

        playerPosition = calculateHighScorePosition(50);
        displayHighScorePosition("Player4", playerPosition);

    }

    public static void displayHighScorePosition(String player, int playerPosition) {
        System.out.println(player + " managed to get into position " + playerPosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else return 4;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    /*public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

            if (gameOver) {
                int finalScore = score + (levelCompleted * bonus);
                finalScore += 2000;
                System.out.println("Your final score was " + finalScore);
            }
        }*/

}
