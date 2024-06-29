package stream_processing_filtering_and_mapping_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExercise {

	static List<String> processData(List<Person> people) {

		return people.stream()
                .filter(person -> person.getAge() >= 30)
                .map(Person::getName)
                .toList();
	}

	public static void main(String[] args) {

		List<Person> people = new ArrayList<>();

		people.add(new Person("Fadi", 31));
		people.add(new Person("Sami", 63));
		people.add(new Person("Reem", 28));
		people.add(new Person("Sandy", 32));
		people.add(new Person("Fadia", 51));
		people.add(new Person("Maram", 26));

		List<String> filteredList = processData(people);

		System.out.println("The original List of People: ");
		people.forEach(System.out::println);
		System.out.println("---------------------");

		System.out.println("The List of People are more than 30 : " );
		System.out.println(filteredList);

	}

}
