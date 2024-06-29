package thread_synchronization_exercise;

public class BankAccountExercise {

	public static void main(String[] args) {
		// Create a BankAccount object with an initial balance of 2350€
		BankAccount account = new BankAccount(2350);

		// Create a Depositor and Withdrawal threads, passing the BankAccount object
		Depositor depositor = new Depositor(account);
		Withdrawal withdrawal = new Withdrawal(account);

		// Start the depositor and withdrawal threads
		depositor.start();
		withdrawal.start();

		// Wait for both threads to finish
		try {
			depositor.join();
			withdrawal.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Print the final balance after both threads have finished their operations
		System.out.println("Your final balance is :" + account.getBalance() + "€");
	}
}