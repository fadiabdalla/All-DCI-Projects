package multi_module_exercise_client;

import multi_module_exercise_bank_account.BankAccount;

public class Client {

	private String name;
	private BankAccount account;

	public Client(String name) {
		this.name = name;
	}

	public void linkBankAccount(BankAccount account) {
		this.account = account;
		System.out.println(name + " linked to the bank account.");
	}

	public void performTransaction(double amount, String transactionType) {
		if (transactionType.equals("deposit")) {
			account.deposit(amount);
		} else if (transactionType.equals("withdraw")) {
			account.withdraw(amount);
		} else {
			System.out.println("Invalid transaction type");
		}
	}
}
