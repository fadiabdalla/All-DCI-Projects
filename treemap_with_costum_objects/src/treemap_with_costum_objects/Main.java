package treemap_with_costum_objects;

import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		TreeMap<Student, Integer> students = new TreeMap<>();
		
		students.put(new Student(107, "Joe"), 56);
		students.put(new Student(102, "Diana"), 72);
		students.put(new Student(103, "Elton"), 4);
		
		
		System.out.println(students);

	}

}
