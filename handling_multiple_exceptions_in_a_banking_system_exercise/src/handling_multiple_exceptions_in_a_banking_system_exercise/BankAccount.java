package handling_multiple_exceptions_in_a_banking_system_exercise;

public class BankAccount {

	private int accountNumber;
	private double balance;
	private int pin;

	public BankAccount(int accountNumber, double balance, int pin) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.pin = pin;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public int getPin() {
		return pin;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount)throws InsufficientFundsException {
		if (amount > balance) {
			throw new InsufficientFundsException("Insufficient funds");
		}
		balance -= amount;
	}
}