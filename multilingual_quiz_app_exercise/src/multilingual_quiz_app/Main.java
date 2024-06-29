package multilingual_quiz_app;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a language:");
        System.out.println("1. English");
        System.out.println("2. Spanish");
        System.out.println("3. German");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        Locale selectedLocale;

        switch (choice) {
            case 1:
                selectedLocale = new Locale("en", "US");
                break;
            case 2:
                selectedLocale = new Locale("es", "ES");
                break;
            case 3:
                selectedLocale = new Locale("de", "DE");
                break;
            default:
                System.out.println("Invalid choice. Defaulting to English.");
                selectedLocale = new Locale("en", "US");
        }

        QuizService quizService = new QuizService(selectedLocale);
        quizService.playQuiz();
    }
}
