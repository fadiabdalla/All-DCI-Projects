package inheritance_animals_exercise;

public class Main {

	public static void main(String[] args) {
		 Mammal mammal = new Mammal();
	        mammal.setName("Lion");
	        mammal.setAge(5);
	        mammal.setFurColor("Golden");
	        
	     
	        Bird bird = new Bird();
	        bird.setName("Eagle");
	        bird.setAge(3);
	        bird.setFeatherColor("Brown");

	     
	        System.out.println("Mammal Info:");
	        mammal.displayInfo();
	        System.out.println();
	        System.out.println("Bird Info:");
	        bird.displayInfo();
	    }
	}