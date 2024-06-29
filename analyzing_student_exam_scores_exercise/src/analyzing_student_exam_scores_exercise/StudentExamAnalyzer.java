package analyzing_student_exam_scores_exercise;

public class StudentExamAnalyzer {

	public double calculateAverage(int[] arr) {

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];

		}

		double average = sum / arr.length;

		return average;
	}

	public int findHighestScore(int[] arr) {

		int highestScore = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > highestScore) {

				highestScore = arr[i];

			}

		}

		return highestScore;
	}

	public int countAboveAverage(int[] arr) {

		double average = calculateAverage(arr);

		int aboveAverage = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > average) {

				aboveAverage++;

			}

		}

		return aboveAverage;

	}

	public double calculatePercentage(int[] arr) {

		int aboveAverage = countAboveAverage(arr);

		double percentage = ((double) aboveAverage / arr.length) * 100;

		return percentage;
	}

}
