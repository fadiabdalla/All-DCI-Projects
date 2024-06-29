package improve_code_exercise;

public class Task {
	// 5. It's more readable to organize our code in methods

	// Task 1: Count the number of words in the sentence.
	public void wordCounter(String input) {

		int wordCount = 0;
		String[] words = input.split(" ");
		for (String word : words) {
			if (!word.isEmpty()) {
				wordCount++;
			}
		}

		System.out.println("The Words count is : " + wordCount);

	}

	// Task 2: Find and print the longest word in the sentence.
	public void findAndPrintLongestWord(String input) {

		String longestWord = "";
		String[] words = input.split(" ");
		for (String word : words) {
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}
		System.out.println("Longest word: " + longestWord);

	}

	// Task 3: Remove vowels from the sentence.
	public void removeVowels(String input) {

		String noVowels = input.replaceAll("[AEIOUaeiou]", "");
		System.out.println("Sentence without vowels: " + noVowels);

	}

}
