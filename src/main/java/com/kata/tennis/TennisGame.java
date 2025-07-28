package com.kata.tennis;

public class TennisGame {
    private boolean aScored = false;

    public String getScore() {
        if (aScored) {
            return "Player A : 15 / Player B : 0";
        }
        return "Player A : 0 / Player B : 0";
    }

    public void pointWonBy(char player) {
        if (player == 'A') aScored = true;
    }


}
