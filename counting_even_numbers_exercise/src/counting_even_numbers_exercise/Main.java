package counting_even_numbers_exercise;

public class Main {

	public static void main(String[] args) {

		int[][] arr = { { 5, 3, 2, 8, 6, 12 }, { 14, 20, 7, 9, 11, 34 } };

		int evenNumbersCount = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] % 2 == 0) {

					evenNumbersCount++;

				}
			}

		}

		System.out.println("The count of the even numbers in the given array is " + evenNumbersCount);

	}

}
