package inheritance_animals_exercise;

class Bird extends Animal {
     String featherColor;

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public void makeSound() {
        System.out.println("The sound is : Bird sound.");
    }

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Feather Color: " + featherColor);
		
	}
    
   
    
}