package voting_eligibility_checker_exercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your age please :");
		int age = scanner.nextInt();

		System.out.println("Are you a citizen? (true/false): ");
		boolean status = scanner.nextBoolean();

		boolean eligibleToVote = (age >= 18) && status;

		if (eligibleToVote) {

			System.out.println("You are eligible to vote");

		} else {

			System.out.println("You are not eligible to vote");

		}

		scanner.close();
	}

}
