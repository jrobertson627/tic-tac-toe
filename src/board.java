public class board { 
    private char[][] outBoard;
    private String name;

    public board() {
        char[][] board = {{'*', '*', '*'}, {'*', '*', '*'}, {'*', '*', '*'}};
        this.outBoard = board;
        String defaultName = "Tic-Tac-Toe Board";
        this.name = defaultName;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void changeSpace(int row, int column, char change) {
        outBoard[row][column] = change;
    }

    public void printBoard() {
        System.out.println(name);
        System.out.println("    0 1 2 ");
        System.out.println("------------");
        for(int i = 0; i < 3; i++) {
            int j = 0;
            System.out.print(j + " | ");
            for (j = 0; j < 3; j++) {
                System.out.print(outBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}
