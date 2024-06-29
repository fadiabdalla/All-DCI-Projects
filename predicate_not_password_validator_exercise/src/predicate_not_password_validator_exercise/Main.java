package predicate_not_password_validator_exercise;

import java.util.Scanner;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter password to check if it is valid: ");
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        Predicate<String> validPassword = p -> p.length() >= 8 &&
                p.chars().anyMatch(Character::isUpperCase) &&
                p.chars().anyMatch(Character::isDigit);

        Predicate<String> invalidPassword = Predicate.not(validPassword);

        if (invalidPassword.test(password)) {
            System.out.println("The password is not valid!");
        } else {
            System.out.println("The password is valid!");
        }
    }
}
