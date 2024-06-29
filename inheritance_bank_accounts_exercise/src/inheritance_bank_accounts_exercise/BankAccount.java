package inheritance_bank_accounts_exercise;

public class BankAccount {

	int accountNumber;
	double balance;

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {

		balance = balance + amount;
	}

	public void withdraw(double amount) {

		balance = balance - amount;
	}

	public void displayInfo() {
		System.out.println("Account number : " + accountNumber);
		System.out.println("Balance : $" + balance);
	}
}
