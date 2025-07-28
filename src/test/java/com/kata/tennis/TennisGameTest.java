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
        game.play("A");
        assertEquals("Player A : 15 / Player B : 0", game.getScore());
    }

    @Test
    void playerBScoresFirst() {
        TennisGame game = new TennisGame();
        game.play("B");
        assertEquals("Player A : 0 / Player B : 15", game.getScore());
    }

    @Test
    void playerAScoresThreePoints() {
        TennisGame game = new TennisGame();
        game.play("AAA");
        assertEquals("Player A : 40 / Player B : 0", game.getScore());
    }

    @Test
    void testDeuce() {
        TennisGame game = new TennisGame();
        game.play("ABABAB");
        assertEquals("Deuce", game.getScore());
    }

    @Test
    void testAdvantageAfterDeuce() {
        TennisGame game = new TennisGame();
        game.play("ABABABA");
        assertEquals("Advantage Player A", game.getScore());
    }


    @Test
    void testPlayerAWinsAfterAdvantage() {
        TennisGame game = new TennisGame();
        game.play("ABABAAAA");
        assertEquals("Player A wins the game", game.getScore());
    }


    @Test
    void testPlayerAWinsDirectly() {
        TennisGame game = new TennisGame();
        game.play("AAAA");
        assertEquals("Player A wins the game", game.getScore());
    }


    @Test
    void testPlayerBWinsDirectly() {
        TennisGame game = new TennisGame();
        game.play("BBBB");
        assertEquals("Player B wins the game", game.getScore());
    }


    @Test
    void testReturnToDeuceAfterLosingAdvantage() {
        TennisGame game = new TennisGame();
        game.play("ABABABAB"); // Deuce -> Advantage A -> B gagne -> retour à Deuce
        assertEquals("Deuce", game.getScore());
    }


    @Test
    void testBackToDeuceFromAdvantage() {
        TennisGame game = new TennisGame();
        game.play("AAABBBAB");
        assertEquals("Deuce", game.getScore());
    }

}

