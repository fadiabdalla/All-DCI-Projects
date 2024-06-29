package for_each_loops;

public class Main {

	public static void main(String[] args) {

		String[] animals = { "cat", "dog", "elephant", "sloth" };

		for (String animal : animals) {

			System.out.println(animal);

		}

		int[] score = { 125, 132, 95, 116, 154 };

		int highestScore = maximum(score);

		System.out.println("The highest score is : " + highestScore);

	}

	public static int maximum(int[] numbers) {

		int maxSoFar = numbers[0];

		for (int num : numbers) {

			if (num > maxSoFar) {
				maxSoFar = num;
			}
		}

		return maxSoFar;
	}

}
