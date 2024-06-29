package my_first_project;

import java.util.Scanner;

public class GameController {
	Scanner scanner = new Scanner(System.in);
	Question[] questions;
	int currentQuestionIndex = 0;
	int[] prizeAmount = { 100, 200, 300, 500, 1000, 2000, 4000, 8000, 16000, 32000, 64000, 125000, 2500000, 500000,
			1000000 };

	public GameController() {
		questions();
	}

	public void questions() {

		questions = new Question[15];

		questions[0] = new Question("Question 1 for 100$ :\nWhat is the capital of Japan?",
				new String[] { "Tokyo", "Beijing", "Seoul", "Bangkok" }, 0);

		questions[1] = new Question("Question 2 for 200$ :\nWhich planet is known as the Red Planet?",
				new String[] { "Venus", "Mars", "Jupiter", "Saturn" }, 1);

		questions[2] = new Question("Question 3 for 300$ :\nWho painted the Mona Lisa?",
				new String[] { "Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Michelangelo" }, 2);

		questions[3] = new Question("Question 4 for 500$ :\nWhat is the largest mammal?",
				new String[] { "African Elephant", "Giraffe", "Blue Whale", "Hippopotamus" }, 2);

		questions[4] = new Question("Question 5 for 1,000$ :\nWhich gas do plants primarily use for photosynthesis?",
				new String[] { "Carbon Dioxide", "Oxygen", "Nitrogen", "Hydrogen" }, 0);

		questions[5] = new Question("Question 6 for 2,000$ :\nWhat is the largest ocean in the world?",
				new String[] { "Atlantic Ocean", "Arctic Ocean", "Indian Ocean", "Pacific Ocean" }, 3);

		questions[6] = new Question("Question 7 for 4,000$ :\nWhich scientist developed the theory of relativity?",
				new String[] { "Isaac Newton", "Niels Bohr", "Albert Einstein", "Galileo Galilei" }, 2);

		questions[7] = new Question("Question 8 for 8,000$ :\nWhat is the national flower of Japan?",
				new String[] { "Cherry Blossom", "Tulip", "Rose", "Lily" }, 0);

		questions[8] = new Question("Question 9 for 16,000$ :\nWhat is the chemical symbol for gold?",
				new String[] { "Ag", "Au", "Hg", "Fe" }, 1);

		questions[9] = new Question("Question 10 for 32,000$ :\nWhich famous playwright wrote 'Romeo and Juliet'?",
				new String[] { "William Shakespeare", "Charles Dickens", "Mark Twain", "Jane Austen" }, 0);

		questions[10] = new Question("Question 11 for 64,000$ :\nWhat is the largest organ in the human body?",
				new String[] { "Heart", "Brain", "Lungs", "Skin" }, 3);

		questions[11] = new Question(
				"Question 12 for 125,000$ :\\nWhich planet is known as the 'Morning Star' or 'Evening Star'?",
				new String[] { "Mercury", "Venus", "Mars", "Jupiter" }, 1);

		questions[12] = new Question("Question 13 for 250,000$ :\\nWhat is the tallest mountain in the world?",
				new String[] { "Mount Kilimanjaro", "Mount Everest", "Mount Fuji", "Mount McKinley" }, 1);

		questions[13] = new Question(
				"Question 14 for 500,000$ :\\nWhich instrument is commonly associated with Wolfgang Amadeus Mozart?",
				new String[] { "Piano", "Violin", "Flute", "Trumpet" }, 0);

		questions[14] = new Question(
				"Question 15 for 1,000,000$ :\\nThe Milion Dollar Question : \nIn which year did the United States declare its independence?",
				new String[] { "1776", "1789", "1801", "1812" }, 0);

	}

	public void playGame() {
		while (currentQuestionIndex < questions.length) {
			Question currentQuestion = questions[currentQuestionIndex];
			currentQuestion.displayQuestion();
			int answer = getUserInput();

			if (currentQuestion.isCorrectAnswer(answer - 1)) {
				System.out.println("Correct answer! You've won $" + prizeAmount[currentQuestionIndex]);
				currentQuestionIndex++;
			} else {
				System.out.println("Incorrect answer! Game over. You have won 0$");
				break;
			}
		}

		if (currentQuestionIndex == questions.length) {
			System.out.println("Congratulations! You've won the game");
		}
	}

	private int getUserInput() {
		int input = 0;
		while (input < 1 || input > 4) {
			System.out.print("Enter your answer (1-4): ");
			input = scanner.nextInt();
		}
		return input;
	}

}
