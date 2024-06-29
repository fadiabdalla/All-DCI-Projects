package abstract_classes_banking_system_exercise;

public class CheckingAccount extends BankAccount {
	private double overdraftLimit;

	@Override
	public void deposit(double amount) {

		double newBalance = getBalance() + amount;
		setBalance(newBalance);
		System.out.println("Deposit of " + amount + "$ completed successfully!");
		System.out.println("Your Balane is : " + newBalance);
		System.out.println("-----------------------------------");
	}

	@Override
	public void withdraw(double amount) {

		double newBalance = getBalance() - amount;
		if (newBalance >= 0) {
			setBalance(newBalance);
			System.out.println("Withdrawal completed successfully!");
			System.out.println("Your Balane is : " + newBalance);
			System.out.println("-----------------------------------");
		} else {

			System.out.println("Your Balance is not enough to complete the transaction!");
			System.out.println("-----------------------------------");
		}
	}

	@Override
	public void displayAccountInfo() {
		System.out.println("Account info : ");
		System.out.println("Acccount number : " + getAccountNumber());
		System.out.println("Acccount holder : " + getAccountHolder());
		System.out.println("Type : Checking Account.");
		;
		System.out.println("Balance : $" + getBalance());
		System.out.println("Overdraft Limit : " + overdraftLimit);
		System.out.println("-----------------------------------");

	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

}
