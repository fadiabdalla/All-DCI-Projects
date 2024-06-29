package switch_expressions_coffee_shop_order_exercise;

public class Coffee {
    private String name;
    private int sizeChoice;
    private double price;
    private int quantity;

    public Coffee(String name, int sizeChoice, double price) {
        this.name = name;
        this.sizeChoice = sizeChoice;
        this.price = price;
        this.quantity = 1;
    }

    public String getName() {
        return name;
    }

    public int getSizeChoice() {
        return sizeChoice;
    }

    public double getPrice() {
        return price;
    }

    public void incrementQuantity() {
        quantity++;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public String getSizeName(int sizeChoice) {
        return switch (sizeChoice) {
            case 1 -> "Small";
            case 2 -> "Medium";
            case 3 -> "Large";
            default -> "Invalid Size";
        };
    }

    @Override
    public String toString() {
        return "Coffee: " + name + ", Size: " + getSizeName(sizeChoice) + ", Quantity: " + quantity + ", Total Price: $" + getTotalPrice();
    }
}
