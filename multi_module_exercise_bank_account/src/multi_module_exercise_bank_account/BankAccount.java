package multi_module_exercise_bank_account;

public class BankAccount {
	private double balance;

	public BankAccount(double initialBalance) {

		this.balance = initialBalance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit of " + amount + " successful. Current balance: " + balance);
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0) {
			if (balance >= amount) {
				balance -= amount;
				System.out.println("Withdrawal of " + amount + " successful. Current balance: " + balance);
			} else {
				System.out.println("Insufficient funds for withdrawal.");
			}
		}
	}

	public void checkBalance() {

		System.out.println("Current balance: " + balance);
	}
}
