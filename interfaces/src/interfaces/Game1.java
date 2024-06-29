package interfaces;

public class Game1 implements Game {

	@Override
	public void play() {

		System.out.println("Playing...");
	}

	
	
	public static void main(String[] args) {
		
		Game g = new Game1();
		
		g.play();
		

	}


}
