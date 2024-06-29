package inheritance_animals_exercise;

public class Animal {

	String name;
	int age;
	
	

	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void makeSound() {}
	
	public void displayInfo() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		makeSound();
		
	}
	
}
