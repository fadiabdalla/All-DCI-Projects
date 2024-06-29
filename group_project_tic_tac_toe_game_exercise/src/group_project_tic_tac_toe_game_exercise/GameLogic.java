package group_project_tic_tac_toe_game_exercise;

public class GameLogic {
    private char[][] board;
    private char currentPlayerMark;

    public GameLogic() {
        board = new char[3][3];
        currentPlayerMark = 'X';
        initializeBoard();
    }

    void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }
    
    public void getBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            System.out.println("---------");
        }
    }

    public char getCurrentPlayerMark() {
        return currentPlayerMark;
    }

    public boolean makeMove(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
            board[row][col] = currentPlayerMark;
            return true;
        }
        return false;
    }

    public void switchPlayer() {
        currentPlayerMark = (currentPlayerMark == 'X') ? 'O' : 'X';
    }

    public boolean checkForWin() {
    	 for (int i = 0; i < 3; i++) {
             if ((board[i][0] == currentPlayerMark && board[i][1] == currentPlayerMark && board[i][2] == currentPlayerMark) ||
                 (board[0][i] == currentPlayerMark && board[1][i] == currentPlayerMark && board[2][i] == currentPlayerMark)) {
                 return true;
             }
         }
         if ((board[0][0] == currentPlayerMark && board[1][1] == currentPlayerMark && board[2][2] == currentPlayerMark) ||
             (board[0][2] == currentPlayerMark && board[1][1] == currentPlayerMark && board[2][0] == currentPlayerMark)) {
             return true;
         }
         return false;
    }

    public boolean isBoardFull() {
    	 for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 if (board[i][j] == '-') {
                     return false;
                 }
             }
         }
         return true;
    }
}
