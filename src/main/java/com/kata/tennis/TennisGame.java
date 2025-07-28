package com.kata.tennis;

public class TennisGame {
    private Score scoreA = Score.LOVE;
    private Score scoreB = Score.LOVE;



    public String getScore() {
        return "Player A : " + scoreA.getDisplayValue() + " / Player B : " + scoreB.getDisplayValue();
    }
    public void pointWonBy(char player) {
        if (player == 'A') {
            scoreA = nextScore(scoreA);
        } else if (player == 'B') {
            scoreB = nextScore(scoreB);
        }
    }

    private Score nextScore(Score current) {
        return switch (current) {
            case LOVE -> Score.FIFTEEN;
            case FIFTEEN -> Score.THIRTY;
            case THIRTY -> Score.FORTY;
            default -> Score.FORTY;
        };
    }




}
