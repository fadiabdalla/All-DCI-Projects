package stream_processing_filtering_and_transforming_exercise;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExercise {
	
	static List<String> filterAndTransform(List<Employee> employees,Predicate<Employee> filter,
			Function<Employee, String> transform) {

		return employees.stream()
				.filter(filter)
				.map(transform)
				.collect(Collectors.toList());

	}

	public static void main(String[] args) {

		var employees = List.of(
				new Employee("Fadi", 31),
				new Employee("Sami", 63),
				new Employee("Reem", 28),
				new Employee("Sandy", 32),
				new Employee("Fadia", 51),
				new Employee("Maram", 26));

		Predicate<Employee> filter = employee -> employee.getAge() >= 30;
		Function<Employee, String> transform = Employee::getName;

		var filteredList = filterAndTransform(employees, filter, transform);
		System.out.println("The original List of People: ");
		employees.forEach(System.out::println);
		System.out.println("---------------------");

		System.out.println("The List of People are more than 30 : ");

		filteredList.forEach(System.out::println);

	}

}
