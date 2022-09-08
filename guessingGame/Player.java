package com.company.guessingGame;

public class Player {
    private String name;
    private int amountOfGuesses;
    private boolean hasPlayerFinishedAllTries;
    private int points;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfGuesses() {
        return amountOfGuesses;
    }

    public void setAmountOfGuesses(int amountOfGuesses) {
        this.amountOfGuesses = amountOfGuesses;
    }

    public boolean isHasPlayerFinishedAllTries() {
        return hasPlayerFinishedAllTries;
    }

    public void setHasPlayerFinishedAllTries(boolean hasPlayerFinishedAllTries) {
        this.hasPlayerFinishedAllTries = hasPlayerFinishedAllTries;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void playerResult(int points) {

        if (points < 2) System.out.println("You failed the guessing game please try again you only scored " + this.getPoints());
        else System.out.println("Great job you won the guessing game scored " + this.getPoints());


    }
}
