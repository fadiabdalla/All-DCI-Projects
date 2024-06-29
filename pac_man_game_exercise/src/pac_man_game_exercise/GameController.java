package pac_man_game_exercise;

import java.util.Scanner;

public class GameController {
	Board board;
	int pacmanRow;
	int pacmanCol;
	int score;
	boolean poweredUp;

	public GameController(Board board, int startRow, int startCol) {
		this.board = board;
		this.pacmanRow = startRow;
		this.pacmanCol = startCol;
		this.score = 0;
		this.poweredUp = false;
		board.updatePosition(pacmanRow, pacmanCol, 'P');
	}

	public void playGame() {

		Scanner scanner = new Scanner(System.in);

		board.displayBoard(); // Display the initial game board

		while (true) {
			System.out.println("Score : " + score);
			System.out.println("Enter your move (U/D/L/R): ");
			String move = scanner.nextLine().toUpperCase();

			if (move.matches("[UDLR]")) {
				char cellContent = updateStatus(move.charAt(0));

				if (cellContent == 'G') {
					if (poweredUp) {
						board.updatePosition(pacmanRow, pacmanCol, ' '); // Remove Ghost
						board.updatePosition(pacmanRow, pacmanCol, 'P'); // Update Pac-Man position
						poweredUp = false;
					} else {
						System.out.println("Game Over!");
						break;
					}
				}

				board.displayBoard(); // Display updated board

				// Check for win condition
				if (checkWin()) {
					System.out.println("Congratulations! You have eaten all the dots. You win!");
					break;
				}
			} else {
				System.out.println("Invalid input. Use U/D/L/R for movement.");
			}
		}
		scanner.close();
	}

	char updateStatus(char move) {
		int newRow = pacmanRow;
		int newCol = pacmanCol;

		if (move == 'U') {
			newRow--;
		} else if (move == 'D') {
			newRow++;
		} else if (move == 'L') {
			newCol--;
		} else if (move == 'R') {
			newCol++;
		}

		char newCellContent = board.board[newRow][newCol];

		if (newCellContent == '.') {
			score++;
		} else if (newCellContent == '*') {
			poweredUp = true;

		}

		if (newCellContent != '#') {
			board.updatePosition(pacmanRow, pacmanCol, ' '); // Delete dot from previous Pac-Man position
			pacmanRow = newRow;
			pacmanCol = newCol;
			board.updatePosition(pacmanRow, pacmanCol, 'P'); // Update Pac-Man position
		}

		return newCellContent;
	}

	private boolean checkWin() {
		for (char[] row : board.board) {
			for (char cell : row) {
				if (cell == '.') {
					return false; // If there is a dot remaining, return false
				}
			}
		}
		return true; // If no dots remaining, return true (win condition)
	}
}