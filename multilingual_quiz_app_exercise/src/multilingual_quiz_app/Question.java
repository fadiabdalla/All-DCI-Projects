package multilingual_quiz_app;

import java.util.ResourceBundle;

public class Question {
	private ResourceBundle messages;
	private String questionKey;
	private String[] answerOptions;
	private int correctAnswerIndex;

	public Question(ResourceBundle messages, String questionKey, String[] answerOptions, int correctAnswerIndex) {
        this.messages = messages;
        this.questionKey = questionKey;
        this.answerOptions = answerOptions;
        this.correctAnswerIndex = correctAnswerIndex;
    }

	 public void displayQuestion() {
	        System.out.println(messages.getString(questionKey));
	        for (int i = 0; i < answerOptions.length; i++) {
	            System.out.println((i + 1) + ". " + messages.getString(answerOptions[i]));
	        }
	    }


	public boolean isCorrectAnswer(int userAnswer) {
		return userAnswer == (correctAnswerIndex + 1);
	}
}