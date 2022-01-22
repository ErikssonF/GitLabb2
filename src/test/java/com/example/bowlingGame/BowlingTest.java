package com.example.bowlingGame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BowlingTest {

    @Test
    void gutterBallShouldReturnScoreZero() {
        Game game = new Game();

        game.roll(0);
        int result = game.score();

        assertEquals(0, result);
    }

    @Test
    void singlePinKnockedShouldGiveScoreOne() {
        Game game = new Game();

        game.roll(1);
        int result = game.score();

        assertEquals(1, result);
    }

    @Test
    void scoreShouldReturnSumOfTwoRolls() {

        Game game = new Game();

        game.roll(2);
        game.roll(3);
        int result = game.score();

        assertEquals(5, result);

    }

    @Test
    void scoreShouldReturnSumOfEntireGame() {
        Game game = new Game();

        game.fullSeries(20, 10);
        int result = game.score();

        assertEquals(300, result);
    }

    @Test
    @DisplayName("Strike is worth 10 points, plus points for the next 2 rolls")
    void scoringAStrikeShouldReturnSumOfStrikePlusNextTwoRolls() {

        Game game = new Game();

        game.roll(10);
        game.roll(3);
        game.roll(5);

        int result = game.score();

        assertEquals(26, game.strikeScore(3,5));


    }

}
