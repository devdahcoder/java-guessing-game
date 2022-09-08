package com.company.guessingGame;

import java.util.Scanner;

public class GuessGame {
    Scanner getPlayerGuess = new Scanner(System.in);
    Player player = new Player();
    int targetNumber = (int) (Math.random() * 2);
    int playerPoints = 0;
    int guessCount = 0;

    public void guess() {
        System.out.println("I'm thinking of a number between 0 - 20 " +
                "guess the numbers correctly and you score points Good luck ;)");

        while (player.getAmountOfGuesses() < 2) {

            System.out.println("Guess a number between 0 - 20: ");
            int guessedNumber = getPlayerGuess.nextInt();
            player.setAmountOfGuesses(guessCount++);

            if (guessedNumber == targetNumber) {
                player.setPoints(playerPoints++);
                if (!player.isHasPlayerFinishedAllTries()) {
                    System.out.println("Correct!! keep going.");
                } else {
                    System.out.println("Correct!!.");
                }
            } else {
                System.out.println("Oops Wrong! correct number was " + targetNumber);
            }


        }
        player.setHasPlayerFinishedAllTries(true);
        player.playerResult(player.getPoints());
    }

}
