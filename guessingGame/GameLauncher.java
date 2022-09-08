package com.company.guessingGame;


import java.util.Scanner;

public class GameLauncher {

    Scanner playerName = new Scanner(System.in);
    GuessGame guessGame = new GuessGame();
    Player player = new Player();

    public void startGame() {
        getPlayerName();
    }

    private void getPlayerName() {
        int getPlayerNameCount = 4;
        System.out.println("Hey there welcome to my guessing game");
        while (true) {
            System.out.print("Please tell me your name: ");
            String getPlayerName = playerName.nextLine();

            if (!getPlayerName.isEmpty() ) {
                player.setName(getPlayerName);
                System.out.println("Welcome " + player.getName() + " let's play \n \n \n");
                guessGame.guess();
                break;
            } else if (getPlayerNameCount < 1) {
                System.out.println("You've used up all your tries ");
                break;
            }

            System.out.println("Name cannot be blank please provide a name");
            System.out.printf("You have %d attempts left\n", getPlayerNameCount);
            getPlayerNameCount--;
        }
    }

}
