package multilingual_quiz_app;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class QuizService {
    private ResourceBundle messages;
    private Question[] questions;
    private int currentQuestionIndex = 0;
    private Scanner scanner = new Scanner(System.in);

    public QuizService(Locale locale) {
        this.messages = ResourceBundle.getBundle("multilingual_quiz_app/questions", locale);
        initializeQuestions();
    }

    private void initializeQuestions() {
        questions = new Question[15];

        questions[0] = new Question(messages,"question.1", new String[]{"answer.1a", "answer.1b", "answer.1c", "answer.1d"}, 0);
        questions[1] = new Question(messages,"question.2", new String[]{"answer.2a", "answer.2b", "answer.2c", "answer.2d"}, 1);
        questions[2] = new Question(messages,"question.3", new String[]{"answer.3a", "answer.3b", "answer.3c", "answer.3d"}, 2);
        questions[3] = new Question(messages,"question.4", new String[]{"answer.4a", "answer.4b", "answer.4c", "answer.4d"}, 2);
        questions[4] = new Question(messages,"question.5", new String[]{"answer.5a", "answer.5b", "answer.5c", "answer.5d"}, 0);
        questions[5] = new Question(messages,"question.6", new String[]{"answer.6a", "answer.6b", "answer.6c", "answer.6d"}, 3);
        questions[6] = new Question(messages,"question.7", new String[]{"answer.7a", "answer.7b", "answer.7c", "answer.7d"}, 2);
        questions[7] = new Question(messages,"question.8", new String[]{"answer.8a", "answer.8b", "answer.8c", "answer.8d"}, 0);
        questions[8] = new Question(messages,"question.9", new String[]{"answer.9a", "answer.9b", "answer.9c", "answer.9d"}, 1);
        questions[9] = new Question(messages,"question.10", new String[]{"answer.10a", "answer.10b", "answer.10c", "answer.10d"}, 0);
        questions[10] = new Question(messages,"question.11", new String[]{"answer.11a", "answer.11b", "answer.11c", "answer.11d"}, 3);
        questions[11] = new Question(messages,"question.12", new String[]{"answer.12a", "answer.12b", "answer.12c", "answer.12d"}, 1);
        questions[12] = new Question(messages,"question.13", new String[]{"answer.13a", "answer.13b", "answer.13c", "answer.13d"}, 1);
        questions[13] = new Question(messages,"question.14", new String[]{"answer.14a", "answer.14b", "answer.14c", "answer.14d"}, 0);
        questions[14] = new Question(messages,"question.15", new String[]{"answer.15a", "answer.15b", "answer.15c", "answer.15d"}, 0);
    }

    public void playQuiz() {
        while (currentQuestionIndex < questions.length) {
            Question currentQuestion = questions[currentQuestionIndex];
            currentQuestion.displayQuestion();
            int answer = getUserInput();

            if (currentQuestion.isCorrectAnswer(answer)) {
                System.out.println(messages.getString("correct.answer") + getPrizeAmount(currentQuestionIndex));
                currentQuestionIndex++;
            } else {
                System.out.println(messages.getString("incorrect.answer"));
                break;
            }
        }

        if (currentQuestionIndex == questions.length) {
            System.out.println(messages.getString("congratulations"));
        }
    }

    private int getUserInput() {
        int input = 0;
        while (input < 1 || input > 4) {
            System.out.print(messages.getString("user.input"));
            try {
                input = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(messages.getString("user.invalid.input"));
            }
        }
        return input;
    }

    private int getPrizeAmount(int index) {
        int[] prizeAmount = {100, 200, 300, 500, 1000, 2000, 4000, 8000, 16000, 32000, 64000, 125000, 2500000, 500000, 1000000};
        if (index >= 0 && index < prizeAmount.length) {
            return prizeAmount[index];
        }
        return 0;
    }
}
