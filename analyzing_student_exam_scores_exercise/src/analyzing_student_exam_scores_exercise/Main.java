package analyzing_student_exam_scores_exercise;

public class Main {

	public static void main(String[] args) {

		int[] scores = { 50, 45, 80, 76, 93, 65, 77, 82, 97 };

		StudentExamAnalyzer analyzer = new StudentExamAnalyzer();

		double average = analyzer.calculateAverage(scores);

		System.out.println("The average of scores is : " + average);

		int highestScore = analyzer.findHighestScore(scores);

		System.out.println("The highest score is : " + highestScore);

		int aboveAverage = analyzer.countAboveAverage(scores);

		System.out.println("The number of students whose scores are above the average  is : " + aboveAverage);

		double percentage = analyzer.calculatePercentage(scores);

		System.out.println("The percentage of students whose scores are above the average  is : "
				+ String.format("%.2f", percentage) + "%");

	}

}
