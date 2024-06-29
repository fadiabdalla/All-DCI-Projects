package pac_man_game_exercise;

public class App {

	public static void main(String[] args) {

		char[][] pitch = { { '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' },
				{ '#', '.', '.', '.', 'G', '.', '.', '.', '*', '.', '#' },
				{ '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#' },
				{ '#', '.', '.', '*', '.', '.', '.', '.', '.', '.', '#' },
				{ '#', '.', 'G', '.', '.', 'P', '.', '.', 'G', '.', '#' },
				{ '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#' },
				{ '#', '.', 'G', '.', '.', '.', '.', 'G', '.', '.', '#' },
				{ '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#' },
				{ '#', '.', 'G', '.', '.', '.', '.', '.', '.', '.', '#' },
				{ '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#' } };

		Board gameBoard = new Board(pitch); // Creating the game board
		GameController gc = new GameController(gameBoard, 4, 5); // Starting the game controller
		gc.playGame(); // Playing the game
	}
}
