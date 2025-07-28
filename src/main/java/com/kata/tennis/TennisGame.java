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

        return playerA.getName() + " : " + playerA.getDisplayScore()
                + " / " + playerB.getName() + " : " + playerB.getDisplayScore();
    }



    private boolean isDeuce() {
        return playerA.getScore() == Score.FORTY && playerB.getScore() == Score.FORTY;
    }

    public void pointWonBy(char playerChar) {
        Player scorer = (playerChar == 'A') ? playerA : playerB;
        Player opponent = (playerChar == 'A') ? playerB : playerA;

        if (winner != null) return;

        if (isDeuce()  || advantagePlayer != null ) {
            handleDeuceScenario(scorer);
            return;
        }

        if (scorer.hasWonAgainst(opponent)) {
            winner = scorer;
            return;
        }

        scorer.incrementScore();
    }

    private void handleDeuceScenario(Player scorer) {
        if (advantagePlayer == null) {
            advantagePlayer = scorer;
        } else if (advantagePlayer == scorer) {
            winner = scorer;
        } else {
            advantagePlayer = null;
        }
    }

    public static void main(String[] args) {
        TennisGame game = new TennisGame();
        String sequence = "ABABAA";

        for (char c : sequence.toCharArray()) {
            game.pointWonBy(c);
            String score = game.getScore();
            System.out.println(score);
        }
    }





}
