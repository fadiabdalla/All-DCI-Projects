package instance_method_reference_with_predicate_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		list.add(new Person("Fadi", 31));
		list.add(new Person("Sam", 14));
		list.add(new Person("Sandy", 18));
		list.add(new Person("Joe", 34));
		list.add(new Person("Alex", 13));

		Predicate<Person> filter = Person::isAdult;

		List<String> adultNames = filterAdults(list, filter);
		adultNames.forEach(System.out::println);
	}

	static List<String> filterAdults(List<Person> list, Predicate<Person> filter) {
		return list.stream()
				.filter(filter)
				.map(Person::getName)
				.collect(Collectors.toList());
	}
}
