package atomic_integer_price_calculator_exercise;

import java.util.concurrent.atomic.AtomicInteger;

public class ShoppingCart {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger totalPrice = new AtomicInteger(0);

        // Create and start multiple threads to simulate adding prices of items to the shopping cart
        Thread thread1 = new Thread(new AddItem(totalPrice, 35));
        Thread thread2 = new Thread(new AddItem(totalPrice, 75));
        Thread thread3 = new Thread(new AddItem(totalPrice, 110));

        thread1.start();
        thread2.start();
        thread3.start();

        
        thread1.join();
        thread2.join();
        thread3.join();

        // Calculate and display the final total price
        System.out.println("Final total price: " + totalPrice.get());
    }
}
