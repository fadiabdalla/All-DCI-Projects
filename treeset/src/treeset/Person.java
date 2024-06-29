package treeset;

public class Person implements Comparable<Person> {
	
	
	String name;
	int age;
	
	public Person (String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}

	public String toString() {
		return name + " " + age;
	}

	@Override
	public int compareTo(Person other) {
		
		// Alphabetical Order
		return name.compareTo(other.name);
		
		//Reverse Alphabetical Order :
		// return other.name.compareTo(this.name);
		
		//-------------------------------------------
		
		//Natural Integer Order  :
		// return ((Integer)age).compareTo(other.age);
		
		//---------------------------------------------
		
		//Reverse Natural Integer Order:
		//return ((Integer)other.age).compareTo(this.age);
		
	}
	
	
	

}
