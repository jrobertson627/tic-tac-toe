public class player {
    String name;
    char symbol;
    
    player(String playerName, char playerSymbol) {
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