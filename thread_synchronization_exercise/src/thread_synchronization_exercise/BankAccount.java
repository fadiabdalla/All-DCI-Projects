package thread_synchronization_exercise;

public class BankAccount {

	 private int balance = 0;
	
	public BankAccount(int balance) {
		this.balance = balance;
	}

	// Synchronized deposit method to ensure thread safety
	public synchronized void deposit(int amount) {
		balance += amount;
		System.out.println("You have successfully deposited " + amount + "€!\nYour new Balance is : " + balance + "€");
	}

	// Synchronized withdraw method to ensure thread safety
	public synchronized void withdraw(int amount) {
		if (amount > balance) {
			System.out.println("Insufficient funds! Please top up your account");
		} else {
			balance -= amount;
			System.out.println(
					"You have successfully withdrawn " + amount + "€!\nYour new Balance is : " + balance + "€");
		}
	}

	// Getter method to retrieve the current balance
	public int getBalance() {
		return balance;
	}
}