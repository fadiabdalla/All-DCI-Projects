package restaurant_seating_system_exercise;

class Customer implements Runnable {
    private Tables tables;

    public Customer(Tables tables) {
        this.tables = tables;
    }

    @Override
    public void run() {
        try {
            // Simulate waiting a customer
            Thread.sleep((long) (Math.random() * 5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Simulate customer using a table
        tables.useTable();
        try {
            // Simulate customer enjoying meal
            Thread.sleep((long) (Math.random() * 5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Simulate customer leaving the table
        tables.newFreeTable();
    }
}