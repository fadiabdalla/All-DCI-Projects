package my_first_project;

public class Main {
	public static void main(String[] args) {
		GameController gameController = new GameController();
		displayWelcomeMessage();
		gameController.playGame();
	}

	static void displayWelcomeMessage() {
		System.out.println("Welcome to Who Wants to Be a Millionaire!");
		System.out.println("---------------------------------------");
	}

}
