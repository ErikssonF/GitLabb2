package com.example.bowlingGame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingTest {

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
    void scoreShouldReturnSumOfTwoRolls(){

        Game game = new Game();

        game.roll(2);
        game.roll(3);
        int result = game.score();

        assertEquals(5, result);


    }

    @Test
    void scoreShouldReturnSumOfEntireGame(){
        Game game = new Game();

        game.fullSeries(20, 10);
        int result = game.score();

        assertEquals(20, result);
    }

   

}
