package com.example.bowlingGame;

public class Game {

    int[] rolls = new int[21];
    private int score = 0;

    public void roll(int knockedPins) {

        rolls[score] += knockedPins;

    }

    public int score() {

        for (int i = 0; i < rolls.length; i++) {
            if (rolls[i] == 10)
                strikeScore(rolls[i + 1], rolls[i + 2]);
        }
        return score;
    }

    public void fullSeries(int rolls, int knockedPins) {
        for (int i = 0; i < rolls; i++) {
            score += knockedPins;
        }
    }

    public int strikeScore(int pins1, int pins2) {

        int points = 10;
        int pins = (pins1+pins2)*2;

        return points + pins;

            }
        }


