package com.example.bowlingGame;

public class Game {

    private int score;

    public void roll(int knockedPins) {
        score += knockedPins;
    }

    public int score() {
        return score;
    }
}
