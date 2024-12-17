package com.example.rk_personal.problems.tictactoe.model;
import ch.qos.logback.core.joran.sanity.Pair;
import lombok.Getter;
import lombok.Setter;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Board {

    int size;
    PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int column, PlayingPiece piece){
        if(board[row][column] != null){
            return false;
        }
        board[row][column] = piece;
        return true;
    }

    public List<int[]> getFreeCells(){
        List<int[]> list = new ArrayList<>();
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] == null){
                    int[] in = new int[2];
                    in[0] = i;
                    in[1] = j;
                    list.add(in);
                 }
            }
        }
        return list;
    }

    public void printBoard(){
        for (PlayingPiece[] playingPieces : board) {
            for (PlayingPiece playingPiece : playingPieces) {
                if (playingPiece != null) {
                    System.out.print(playingPiece.pieceType.name() + "   ");
                } else {
                    System.out.print("   ");
                }
                System.out.print(" | ");
            }
            System.out.println();
            System.out.println("---------------------");
        }
    }

}
