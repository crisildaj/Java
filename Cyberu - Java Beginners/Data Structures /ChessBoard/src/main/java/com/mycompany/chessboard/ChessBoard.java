package com.mycompany.chessboard;

import java.util.*;
// 8 x 8
public class ChessBoard {

    public static void main(String[] args) {

        //store dimensions of board
        int boardDim = 8;

        char[][] board =  new char[boardDim][boardDim];
        boolean isWhite = false;

        //iterating down the y-axis of chessboard
        for( int y = 0; y < board.length; y++ ) {


            isWhite = !isWhite;  

            //iterating throught the x-axis
            //board[y] asks the above for loop how long the array is individually
            for( int x = 0; x < board[y].length; x++) {

                //location of row y, column x
                if (isWhite) board[y][x] = 'W';
                if (!isWhite) board[y][x] = 'B';          
                isWhite = !isWhite;  
            }
        }

        for(int i = 0; i < board.length; i++) 
        {
            System.out.println(Arrays.toString(board[i]));
        }

    }
}
