import java.util.*;

public class runGame {
    public static void main(String[] args) {
        startGame();
    }

/*
**Function: startGame
**DateCreated: 10-14-2021
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
        player playerOne = new player(playerName, symbol);

        //Initialize player two
        System.out.println("Player One please enter your name: ");
        String playerNameTwo = in.nextLine();
        System.out.println("Player One please enter the symbol you'd like to use: ");
        char symbolTwo = in.next().charAt(0);
        while(symbolTwo == '*' || symbolTwo == symbol) {
            System.out.println("Please enter a new symbol or letter");
            symbol = in.next().charAt(0);
        }
        player playerTwo = new player(playerNameTwo, symbolTwo);

        //Initialize the board
        board myBoard = new board();
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