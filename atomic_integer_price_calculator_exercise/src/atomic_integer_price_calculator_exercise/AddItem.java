package atomic_integer_price_calculator_exercise;

import java.util.concurrent.atomic.AtomicInteger;

public class AddItem implements Runnable {
    private AtomicInteger totalPrice;
    private int price;

    public AddItem(AtomicInteger totalPrice, int price) {
        this.totalPrice = totalPrice;
        this.price = price;
    }

    @Override
    public void run() {
        totalPrice.addAndGet(price);
    }
}
