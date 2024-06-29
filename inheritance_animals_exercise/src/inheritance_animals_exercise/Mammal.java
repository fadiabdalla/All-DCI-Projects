package inheritance_animals_exercise;

public class Mammal extends Animal {

	String furColor;

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}

	@Override
	public void makeSound() {
		System.out.println("The sound : Roar.");
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Fur Color: " + furColor);

	}

}
