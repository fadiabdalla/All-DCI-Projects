package sum_of_elements_multidimensional_arrays_exercise;

public class Main {

	public static void main(String[] args) {

		int[][] arr = { { 5, 4, 7, 27 }, { 17, 23, 11, 9 } };

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				sum = sum + arr[i][j];
			}

		}
	
		System.out.println("The sum of the all arrays numbers is : " + sum);
		
	}
}
