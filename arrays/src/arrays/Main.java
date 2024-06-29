package arrays;

public class Main {

	public static void main(String[] args) {

		int[] numbers = { 2, 6, 9, 1 };

		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);

		String[] shoppingList = { "Bread", "Tomatoes", "Coffee", "Cheese" };

		shoppingList[1] = "Grapes";

		System.out.println(shoppingList[1]);

		String[] fruits = { "apple", "pear", "kiwi", "peach" };

		for (int i = 0; i < fruits.length; i++) {

			System.out.println(fruits[i]);

		}

		int[] values = new int[4];
		
		values[0] = 6; 

		System.out.println(values.length);

		for (int i = 0; i < values.length; i++) {

			System.out.println(values[i]);

		}

	}

}
