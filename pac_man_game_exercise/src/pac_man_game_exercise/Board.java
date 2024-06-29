package pac_man_game_exercise;

public class Board {

    char[][] board;

    public Board(char[][] board) {
        this.board = board;
    }

    // Display the game board
    public void displayBoard() {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    // Update a specific position on the game board
    public void updatePosition(int row, int col, char newContent) {
        board[row][col] = newContent;
    }
}
