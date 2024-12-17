package com.example.rk_personal.problems.tictactoe;

import com.example.rk_personal.problems.tictactoe.model.Board;
import com.example.rk_personal.problems.tictactoe.model.PieceType;
import com.example.rk_personal.problems.tictactoe.model.Player;
import com.example.rk_personal.problems.tictactoe.model.PlayingPieceO;
import com.example.rk_personal.problems.tictactoe.model.PlayingPieceX;

import lombok.Getter;
import lombok.Setter;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class TicTacToeGame {

    Deque<Player> players;
    Board gameBoard;


    public void initializeGame(){

        players = new LinkedList<>();

        PlayingPieceX payerX = new PlayingPieceX();
        Player player1 = new Player("Player 1", payerX);

        PlayingPieceO pieceO = new PlayingPieceO();
        Player player2 = new Player("Player 2", pieceO);

        gameBoard = new Board(3);
        players.add(player1);
        players.add(player2);

    }

    public String playGame(){

        boolean noWinner = true;
        while(noWinner){

            Player playerTurn = players.removeFirst();

            gameBoard.printBoard();
           List<int[]> freeCells =  gameBoard.getFreeCells();

           if(freeCells.isEmpty()){
                noWinner = false;
                continue;
           }

           System.out.print("Player " + playerTurn.name + "Enter row,column: ");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            String[] values = s.split(",");
            int row = Integer.parseInt(values[0]);
            int column = Integer.parseInt(values[1]);

            boolean pieceAdded = gameBoard.addPiece(row, column,playerTurn.getPiece());

            if (!pieceAdded){
                System.out.println("Incorrect position please enter valid position");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);
            boolean winner = isThereAWinner(row,column,playerTurn.getPiece().pieceType);

            if (winner){
                //                System.out.println("Player " + playerTurn.name + " wins!");
                return playerTurn.getName();
            }



        }

        return "tie";
    }

    private boolean isThereAWinner(int row, int column,PieceType pieceType){
        return checkRows(row, pieceType) || checkColumns(column, pieceType) || checkDiagonals(pieceType) || checkAntiDiagonals(pieceType);
    }

    private boolean checkRows(int row, PieceType pieceType){
        for (int i=0; i<gameBoard.getSize(); i++){
            if(gameBoard.getBoard()[row][i] == null || gameBoard.getBoard()[row][i].pieceType != pieceType){
                return false;
            }
        }
        return true;
    }

    private boolean checkColumns(int column, PieceType pieceType){
        for (int i=0; i<gameBoard.getSize(); i++){
            if(gameBoard.getBoard()[i][column] == null || gameBoard.getBoard()[i][column].pieceType != pieceType){
                return false;
            }
        }
        return true;
    }
    private boolean checkDiagonals(PieceType pieceType){
        for (int i=0; i<gameBoard.getSize(); i++){
            for (int j=0; j<gameBoard.getSize(); j++ ){
                if(gameBoard.getBoard()[i][j] == null || gameBoard.getBoard()[i][j].pieceType != pieceType){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkAntiDiagonals(PieceType pieceType){
        for (int i=0; i<gameBoard.getSize(); i++){
            for (int j=gameBoard.getSize() - 1; j>0; j--){
                if(gameBoard.getBoard()[i][j] == null || gameBoard.getBoard()[i][j].pieceType != pieceType){
                    return false;
                }
            }
        }
        return true;
    }



}
