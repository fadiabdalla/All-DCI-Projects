package enums;

public class Main {
	
	public static void main(String[] args) {
		

		Color color = Color.GREEN;
		
		switch(color) {
		case BLUE:
			break;
		case GREEN:
			break;
		case RED:
			break;
		default:
			break;
		
		
		
		}
		
		System.out.println(Color.RED);
		System.out.println("Enum meaning as a string is : " + Color.RED.name());
		System.out.println(Color.GREEN.getClass());
		System.out.println(Color.GREEN instanceof Enum);
		
		Color color1 = Color.valueOf("GREEN");
		System.out.println(color1);
		
		
		
		for(Color c : color.values()) {
			
			System.out.println("The color is: " + c.name() + " and the value is: " + c.getMeaning());
		}
		
	}

}
