package my_first_project;

public class Question {
	private String question;
	private String[] answerChoices;
	private int correctAnswerIndex;

	public Question(String question, String[] answerChoices, int correctAnswerIndex) {
		this.question = question;
		this.answerChoices = answerChoices;
		this.correctAnswerIndex = correctAnswerIndex;
	}

	public boolean isCorrectAnswer(int answerIndex) {
		return answerIndex == correctAnswerIndex;
	}

	public void displayQuestion() {
		System.out.println(question);
		for (int i = 0; i < answerChoices.length; i++) {
			System.out.println((i + 1) + ". " + answerChoices[i]);
		}
	}
}
