package tic_tac_toe_fun;

import java.util.*;

public class RunGame {
    public static void main(String[] args) {
        startGame();
    }

/*
**Function: startGame
**Date Created: 10-14-2021
**Date Modified: 
**Description: This function starts the game of tic tac toe. It initializes Player name and symbol 
**             and the board that will be used for this game.  
**Post: Game will have started
*/
    public static void startGame() {
        //Initialize scanner
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to my game of tic-tac-toe!");

        //Initialize player one
        System.out.println("Player One please enter your name: ");
        String playerName = in.nextLine();
        System.out.println("Player One please enter the symbol or letter you'd like to use: ");
        char symbol = in.next().charAt(0);
        while(symbol == '*') {
            System.out.println("Please enter a new symbol or letter");
            symbol = in.next().charAt(0);
        }
        Player playerOne = new Player(playerName, symbol);

        //Initialize player two
        System.out.println("Player Two please enter your name: ");
        String playerNameTwo = in.nextLine();
        System.out.println("Player Two please enter the symbol you'd like to use: ");
        char symbolTwo = in.next().charAt(0);
        while(symbolTwo == '*' || symbolTwo == symbol) {
            System.out.println("Please enter a new symbol or letter");
            symbol = in.next().charAt(0);
        }
        Player playerTwo = new Player(playerNameTwo, symbolTwo);

        //Initialize the board
        Board myBoard = new Board();
        myBoard.printBoard();

        //close scanner
        in.close();
    }

    public static void runTurn() {

    }

    public static void checkWin() {

    }

    public static void endGame() {

    }

}
