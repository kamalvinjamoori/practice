package com.example.rk_personal.problems.tictactoe;

public class Main {

    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        game.initializeGame();
        System.out.println("game winner is: " + game.playGame());

    }
}
