package array_of_integers_exercise;

public class Main {

	public static void main(String[] args) {

		int[] numbers = { 16, 8, 23, 35, 11, 6, 19 };

		int theSum = calculateSum(numbers);
		System.out.println("The sum of the array's numbers is : " + theSum);

		int theMaximumNumber = findTheMaximum(numbers);
		System.out.println("The maximum Value in the array: " + theMaximumNumber);

		int theMinimumNumber = findTheMinimum(numbers);
		System.out.println("The maximum Value in the array: " + theMinimumNumber);

		double average = calculateAverage(numbers);
		System.out.println("Average value of the integers in the array: " + average);

	}

	public static int calculateSum(int[] arr) {

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			int x = sum;

			sum = x + arr[i];

		}
		return sum;

	}

	public static int findTheMaximum(int[] arr) {

		int maximum = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > maximum) {

				maximum = arr[i];

			}

		}

		return maximum;
	}

	public static int findTheMinimum(int[] arr) {

		int minimum = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < minimum) {

				minimum = arr[i];

			}

		}

		return minimum;
	}

	public static double calculateAverage(int[] arr) {

		int sum = calculateSum(arr);

		return (double) sum / arr.length;

	}

}
