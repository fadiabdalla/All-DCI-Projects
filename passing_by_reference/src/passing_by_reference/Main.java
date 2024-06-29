package passing_by_reference;

public class Main {

	public static void main(String[] args) {

		
		
Person person = new Person("John", 25);
        
        System.out.println("Person:");
        person.displayInfo();
        
        changePerson(person);
        
        System.out.println("The new Person:");
        person.displayInfo();
    }

    public static void changePerson(Person newPerson) {
         newPerson.name = "Alice";
         newPerson.age = 30;
		
		
	}

}
