package number_guessing_game_exercise;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Random random = new Random();

		int x = random.nextInt(101);
		System.out.println(x);

		System.out.println(
				"guess the number! Please enter a number to see if you've guessed the number I'm thinking of :  ");

		int userNum = scanner.nextInt();

		while (x != userNum) {

			System.out.println("Unfortunatly my numberis not " + userNum + ". Try another number :");

			userNum = scanner.nextInt();

		}

		System.out.println("Bingo! you hit it. My number is : " + x);

		scanner.close();

	}

}
