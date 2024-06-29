package online_shopping_game_exercise;

public class Decoration extends VirtualItem{
	
	private String theme;

	public Decoration(int itemID, int points, String name, double price,String theme) {
		super(itemID, points, name, price);
		 this.theme = theme;
	}

	public String getTheme() {
		return theme;
	}
	public void setName(String theme) {
		this.theme = theme;
	}
	
	  @Override
	    public String toString() {
	        return super.toString() + ", Theme: " + theme;
	    }
}
