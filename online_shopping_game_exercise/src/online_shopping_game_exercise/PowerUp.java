package online_shopping_game_exercise;

public class PowerUp extends VirtualItem {

	private String effect;

	public PowerUp(int itemID, int points, String name, double price,String effect) {
		super(itemID, points, name, price);
		this.effect = effect;
	}

	public String getEffect() {
		return effect;
	}

	@Override
	public String toString() {
		return super.toString() + ", Effect: " + effect;
	}

}
