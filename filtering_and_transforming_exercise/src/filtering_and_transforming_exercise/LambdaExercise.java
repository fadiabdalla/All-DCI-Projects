package filtering_and_transforming_exercise;

import java.util.ArrayList;
import java.util.List;

public class LambdaExercise {

	static List<String> filterAndTransform(List<Person> people) {
		List<String> under30 = new ArrayList<>();
		people.forEach((s) -> {
			if (s.age < 30) {
				under30.add(s.name + " - " + s.city);

			}

		});
		return under30;

	}

	public static void main(String[] args) {

		List<Person> people = new ArrayList<>();

		people.add(new Person("Fadi", 31, "Bremen"));
		people.add(new Person("Sam", 21, "Berlin"));
		people.add(new Person("Sarah", 27, "Oldenburg"));
		people.add(new Person("John", 29, "Hamburg"));
		people.add(new Person("Paul", 30, "Frankfurt"));

		List<String> filteredAndTransformed = filterAndTransform(people);
		System.out.println("The people Whose age is smaller than 30 : ");
		filteredAndTransformed.forEach(System.out::println);

	}

}
