package com.aquam.unit_4;

public class Score {

    public static void main(String[] args) {

        System.out.println(calculateScore(true, 800, 5, 100));

        displayHighScorePosition("Olga", calculateHighScorePosition(1500));
        displayHighScorePosition("Olga", calculateHighScorePosition(900));
        displayHighScorePosition("Olga", calculateHighScorePosition(400));
        displayHighScorePosition("Olga", calculateHighScorePosition(1000));

        displayHighScorePosition("Olga", calculateHighScorePosition(80));
        displayHighScorePosition("Olga", calculateHighScorePosition(100));
        displayHighScorePosition("Olga", calculateHighScorePosition(400));
        displayHighScorePosition("Olga", calculateHighScorePosition(500));
        displayHighScorePosition("Olga", calculateHighScorePosition(900));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + levelCompleted * bonus;
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {

        System.out.println(playerName + " managed to get into position " + position + " on the high score table");

    }

    public static int calculateHighScorePosition(int playerScore) {

        /*
        int position = 1;
        if (playerScore < 100)
            position = 4;
        else if (playerScore < 500)
            position = 3;
        else if (playerScore < 1000)
            position = 2;
         */

        int position = 4;
        if(playerScore >= 1000)
            position = 1;
        else if(playerScore >= 500)
            position = 2;
        else if(playerScore >= 100)
            position = 3;

        return position;
    }
}
