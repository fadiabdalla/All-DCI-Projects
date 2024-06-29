package finally_block;

public class Main {

	public static void main(String[] args) {

		try {
			int number = 50/1;
			String text = null;
			System.out.println(text.length());
		}catch (NullPointerException e) {
			
			System.out.println(e);
		}finally {
			System.out.println("finally block is always executed.");
		}
		
		System.out.println("normal flow....");
	}

}
