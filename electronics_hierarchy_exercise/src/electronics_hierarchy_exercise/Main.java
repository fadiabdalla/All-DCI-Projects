package electronics_hierarchy_exercise;

public class Main {

	public static void main(String[] args) {

		Television tele = new Television();
		Smartphone phone = new Smartphone();
		
		tele.setBrand("Samsung");
		tele.setPrice(999.99);
		tele.setScreenSize(65);
		
		System.out.println("Television Info : ");
		System.out.println("Brand :" + tele.getBrand());
		System.out.println("Screen size : " + tele.getScreenSize() + " inch");
		System.out.println("Price : $");
		
		System.out.println();
		
		
		phone.setBrand("Apple Iphone 15 Pro Max");
		phone.setOperatingSystem("IOS");
		phone.setPrice(1399.99);
		
		System.out.println("Smart Phone Info : ");
		System.out.println("Brand :" + phone.getBrand());
		System.out.println("Operation System : " + phone.getOperatingSystem());
		System.out.println("Price : $" + phone.getPrice());
		
		
	}

}
