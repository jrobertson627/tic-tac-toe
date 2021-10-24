package tic_tac_toe_fun;

public class Player {
    String name;
    char symbol;
    
    Player(String playerName, char playerSymbol) {
        this.name = playerName;
        this.symbol = playerSymbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public char getSymbol() {
        return symbol;
    }
    
    public void setSymbol(char newSymbol) {
        symbol = newSymbol;
    }

    public void printPlayer() {
        System.out.println("Player name: " + name);
        System.out.println("Player symbol: " + symbol);
    }
}
