package com.example.bowlingGame;

public class Game {

    int[] rolls = new int[21];
    private int score;

    public void roll(int knockedPins) {

        rolls[score++] += knockedPins;

    }

    public int score() {

        for (int i = 0; i < rolls.length; i++) {
            if (rolls[i] == 10) {
                score = strikeScore(rolls[i + 1], rolls[i + 2]);
            }
            else if (rolls[i]+ rolls[i-1] == 10){
                score = spareScore(rolls[i+1]);
            }
        }

        return score;
    }

    public void fullSeries(int rolls, int knockedPins) {
        for (int i = 0; i < rolls; i++) {
            score += knockedPins;
        }
    }

    public int strikeScore(int pins1, int pins2) {

        return 10+(pins1+pins2)*2;

            }

    public int spareScore(int pins) {

        return pins * 2 + 10;
    }
}


