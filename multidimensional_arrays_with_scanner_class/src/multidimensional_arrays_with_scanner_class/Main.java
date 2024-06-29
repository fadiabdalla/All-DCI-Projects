package multidimensional_arrays_with_scanner_class;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the number of rows: ");
		int numberOfRows = scanner.nextInt();

		System.out.println("Please enter the number of columns: ");
		int numberOfColumns = scanner.nextInt();

		int[][] arr = new int[numberOfRows][numberOfColumns];

		for (int i = 0; i < numberOfRows; i++) {

			for (int j = 0; j < numberOfColumns; j++) {

				arr[i][j] = (i + 2) * (j + 2);

			}

				}
		for (int[] rows : arr) {
			
			for (int value : rows) {
				
				System.out.print(value + " ");


			}

			System.out.println();
		}

		scanner.close();

	}

}
