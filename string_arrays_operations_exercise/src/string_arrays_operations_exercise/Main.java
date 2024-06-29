package string_arrays_operations_exercise;

public class Main {

	public static void main(String[] args) {

		String[] words = { "apple", "strawberry", "grape", "grapefruit", "watermelon", "pineapple" };

		for (int x = 0; x < words.length; x++) {

			System.out.println(words[x]);

		}

		String longestString = findLongestString(words);
		System.out.println("Longest string in the array: " + longestString);

	}

	public static String findLongestString(String[] strings) {
		int maxLength = 0;
		String longest = "";

		for (int i = 0; i < strings.length; i++) {
			if (strings[i].length() > maxLength) {
				maxLength = strings[i].length();
				longest = strings[i];
			}
		}

		return longest;
	}

}
