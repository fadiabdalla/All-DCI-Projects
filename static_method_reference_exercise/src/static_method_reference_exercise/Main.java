package static_method_reference_exercise;

import java.util.List;
import java.util.function.Predicate;

public class Main {

	static List<String> filterPalindromes(List<String> list, Predicate<String> filter) {
		return list.stream()
				.filter(filter)
				.toList();

	}

	public static void main(String[] args) {

		var list = List.of("Fadi", "Dad", "aabbaa", "Nan");

		// The filter logic (calling the isPalindrome method from StringUtils
		// using double colon operator

		Predicate<String> filter = StringUtils::isPalindrome;

		// save the filtered words in a new list
		var filteredList = filterPalindromes(list, filter);

		System.out.println("The words that found as palindrome :");

		// printing the filtered list
		filteredList.forEach(System.out::println);

	}

}
