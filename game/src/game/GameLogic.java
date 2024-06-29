package game;

public class GameLogic {
	private char[][] board;
	private char currentPlayer;
	private boolean gameOver;
	public GameLogic() {
		board = new char[3][3];
		currentPlayer = 'X';
		gameOver = false;
		createBoard();
	}
	 void createBoard() {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				board[row][col] = ' ';
			}
		}
	}
	public boolean makeMove(int row, int col) {
		if (!gameOver && validMove(row, col)) {
			board[row][col] = currentPlayer;
			currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
			return true;
		}
		return false;
	}
	private boolean validMove(int row, int col) {
		return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ');
	}
	public boolean win() {
		return checkRow() || checkCol() || checkDiag();
	}
	private boolean checkRow() {
		for (int row = 0; row < 3; row++) {
			if (board[row][0] != ' ' && board[row][0] == board[row][1] && board[row][1] == board[row][2]) {
				gameOver = true;
				return true;
			}
		}
		return false;
	}
	private boolean checkCol() {
		for (int col = 0; col < 3; col++) {
			if (board[0][col] != ' ' && board[0][col] == board[1][col] && board[1][col] == board[2][col]) {
				gameOver = true;
				return true;
			}
		}
		return false;
	}
	private boolean checkDiag() {
		if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
			gameOver = true;
			return true;
		}
		if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
			gameOver = true;
			return true;
		}
		return false;
	}
	public boolean draw() {
		if (!gameOver) {
			for (int row = 0; row < 3; row++) {
				for (int col = 0; col < 3; col++) {
					if (board[row][col] == ' ') {
						return false;
					}
				}
			}
			gameOver = true;
			return true;
		}
		return false;
	}
	public char[][] getBoard() {
		return board;
	}
	public char getCurrentPlayer() {
		return currentPlayer;
	}
	public boolean isGameOver() {
		return gameOver;
	}
}
