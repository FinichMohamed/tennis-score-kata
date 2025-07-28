package com.kata.tennis;

public class TennisGame {
    private Player playerA = new Player("Player A");
    private Player playerB = new Player("Player B");
    private Player advantagePlayer = null;
    private Player winner = null;

    public String getScore() {
        if (winner != null) {
            return winner.getName() + " wins the game";
        }

        if (playerA.getScore() == Score.FORTY && playerB.getScore() == Score.FORTY) {
            if (advantagePlayer != null) {
                return "Advantage " + advantagePlayer.getName();
            }
            return "Deuce";
        }

        return playerA.getName() + " : " + playerA.getScore().getDisplayValue()
                + " / " + playerB.getName() + " : " + playerB.getScore().getDisplayValue();
    }



    public void pointWonBy(char playerChar) {
        Player scorer = (playerChar == 'A') ? playerA : playerB;
        if (playerA.getScore() == Score.FORTY && playerB.getScore() == Score.FORTY) {
            if (advantagePlayer == null) {
                advantagePlayer = scorer;
            } else if (advantagePlayer == scorer) {
                winner = scorer;
            } else {
                advantagePlayer = null;
            }
            return;
        }

        scorer.incrementScore();
    }



}
