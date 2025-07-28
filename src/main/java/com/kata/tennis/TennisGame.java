package com.kata.tennis;

public class TennisGame {
    private int scoreA = 0;
    private int scoreB = 0;


    public String getScore() {
        return "Player A : " + format(scoreA) + " / Player B : " + format(scoreB);
    }
    public void pointWonBy(char player) {
        if (player == 'A') {
            scoreA++;
        } else if (player == 'B') {
            scoreB++;
        }
    }

    private String format(int score) {
        return switch (score) {
            case 0 -> "0";
            case 1 -> "15";
            case 2 -> "30";
            case 3 -> "40";
            default -> "40";
        };
    }


}
