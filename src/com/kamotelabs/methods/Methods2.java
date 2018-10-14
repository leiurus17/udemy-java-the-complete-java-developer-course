package com.kamotelabs.methods;

public class Methods2 {

    // Create a method called displayHighScorePosition
    // it should display a players name as a parameter, and a 2nd parameter as a position in the high score table
    // You should display the players name along with a message like " managed to get into position " and the
    // position they got and a further message " on the high score table".
    //
    // Create a 2nd method called calculateHighScorePosition
    // it should be sent one argument only, the player score
    // it should return an in
    // the return data should be
    // 1 if the score is >=1000
    // 2 if the score is >=500 and < 1000
    // 3 if the score is >=100 and < 500
    // 4 in all other cases
    // call both methods and display the results of the following
    // a score of 1500, 900, 400 and 50
    //

    public static void main(String[] args) {
        displayHighScorePosition("Marlon", 5083);
        displayHighScorePosition("Sasuke", 999);
        displayHighScorePosition("Naruto", 345);
    }

    public static void displayHighScorePosition(String playerName, int score) {

        System.out.println(playerName
                + " managed to get into position "
                + calculateHighScorePosition(score)
                + " on the high score table.");

    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
