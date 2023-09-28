package com.mycompany.chessboard;

import java.util.*;
// 8 x 8
public class ChessBoard {

    public static void main(String[] args) {

        //store dimensions of board
        int boardDim = 8;

        char[][] board =  new char[boardDim][boardDim];

        //A boolean flag to check whether the current square should be black or white 
        boolean isWhite = false;
        // initially set to flase --> represents black

        //iterating down the y-axis of chessboard (rows)
        for( int y = 0; y < board.length; y++ ) {


            isWhite = !isWhite;  //Toggle the color flag between white and black for each
            //isWhite = true  --> represents white

            //iterating throught the x-axis
            //board[y] asks the above for loop how long the array is individually
            for( int x = 0; x < board[y].length; x++) {

                //location of row y, column x
                if (isWhite) board[y][x] = 'W'; // White square
                if (!isWhite) board[y][x] = 'B'; // Black square         
                isWhite = !isWhite;  
                //isWhite = false --> represents black 
            }
        }

        //Prints the generated chessboard to console
        for(int i = 0; i < board.length; i++) 
        {
            System.out.println(Arrays.toString(board[i]));
        }

    }
}
