package com.kata.tennis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TennisGameTest {

    @Test
    void testInitialScore() {
        TennisGame game = new TennisGame();
        assertEquals("Player A : 0 / Player B : 0", game.getScore());
    }

    @Test
    void playerAScoresFirst() {
        TennisGame game = new TennisGame();
        game.pointWonBy('A');
        assertEquals("Player A : 15 / Player B : 0", game.getScore());
    }

    @Test
    void playerBScoresFirst() {
        TennisGame game = new TennisGame();
        game.pointWonBy('B');
        assertEquals("Player A : 0 / Player B : 15", game.getScore());
    }

    @Test
    void playerAScoresThreePoints() {
        TennisGame game = new TennisGame();
        game.pointWonBy('A');
        game.pointWonBy('A');
        game.pointWonBy('A');
        assertEquals("Player A : 40 / Player B : 0", game.getScore());
    }

    @Test
    void testDeuce() {
        TennisGame game = new TennisGame();
        for (int i = 0; i < 3; i++) {
            game.pointWonBy('A');
            game.pointWonBy('B');
        }
        assertEquals("Deuce", game.getScore());
    }

    @Test
    void testAdvantageAfterDeuce() {
        TennisGame game = new TennisGame();
        for (int i = 0; i < 3; i++) {
            game.pointWonBy('A');
            game.pointWonBy('B');
        }
        game.pointWonBy('A');
        assertEquals("Advantage Player A", game.getScore());
    }




}

