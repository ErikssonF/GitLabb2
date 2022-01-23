package com.example.bowlingGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BowlingTest {

    Game game;

    @BeforeEach
    public void setUp() {
        game = new Game();
    }


    @Test
    void gutterBallShouldReturnScoreZero() {

        game.roll(0);
        int result = game.score();

        assertEquals(0, result);
    }

    @Test
    void singlePinKnockedShouldGiveScoreOne() {

        game.roll(1);
        int result = game.score();

        assertEquals(1, result);
    }

    @Test
    void scoreShouldReturnSumOfTwoRolls() {

        game.roll(2);
        game.roll(3);
        int result = game.score();

        assertEquals(5, result);

    }

    @Test
    void scoreShouldReturnSumOfEntireGame() {

        game.fullSeries(20, 10);
        int result = game.score();

        assertEquals(300, result);
    }

    @Test
    @DisplayName("Strike is worth 10 points, plus points for the next 2 rolls")
    void scoringAStrikeShouldReturnSumOfStrikePlusNextTwoRolls() {

        game.roll(10);
        game.roll(3);
        game.roll(5);

        assertEquals(26, game.strikeScore(3,5));


    }

    @Test
    void scoringASpareShouldReturnSumOfSparePlusNextRoll(){

        game.roll(5);
        game.roll(5);
        game.roll(3);

        assertEquals(16,game.spareScore(3));
    }

}
