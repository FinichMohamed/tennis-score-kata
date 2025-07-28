package com.kata.tennis;

public class TennisGame {
    private Player playerA = new Player("Player A");
    private Player playerB = new Player("Player B");


    public String getScore() {
        if (playerA.getScore() == Score.FORTY && playerB.getScore() == Score.FORTY) {
            return "Deuce";
        }
        return playerA.getName() + " : " + playerA.getScore().getDisplayValue() + " / "
                + playerB.getName() + " : " + playerB.getScore().getDisplayValue();
    }


    public void pointWonBy(char player) {
        if (player == 'A') {
            playerA.incrementScore();
        } else if (player == 'B') {
            playerB.incrementScore();
        }
    }


}
