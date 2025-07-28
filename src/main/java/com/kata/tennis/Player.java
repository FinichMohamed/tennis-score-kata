package com.kata.tennis;

public class Player {

    private final String name;
    private Score score;

    public Player(String name) {
        this.name = name;
        this.score = Score.LOVE;
    }

    public String getName() {
        return name;
    }

    public Score getScore() {
        return score;
    }

    public void incrementScore() {
        this.score = nextScore(score);
    }

    private Score nextScore(Score current) {
        return switch (current) {
            case LOVE -> Score.FIFTEEN;
            case FIFTEEN -> Score.THIRTY;
            case THIRTY -> Score.FORTY;
            default -> Score.FORTY;
        };
    }

    public boolean isAtForty() {
        return this.score == Score.FORTY;
    }

    public String getDisplayScore() {
        return score.getDisplayValue();
    }

    public boolean hasWonAgainst(Player opponent) {
        return this.score == Score.FORTY && opponent.getScore().ordinal() < Score.THIRTY.ordinal();
    }

}
