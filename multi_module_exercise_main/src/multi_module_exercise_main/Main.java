package multi_module_exercise_main;

import multi_module_exercise_bank_account.BankAccount;
import multi_module_exercise_client.Client;

public class Main {

	public static void main(String[] args) {

		Client client = new Client("Fadi");
		BankAccount account = new BankAccount(1250);
		
		client.linkBankAccount(account);
		client.performTransaction(500, "deposit");
		client.performTransaction(200, "withdraw");
		account.checkBalance();
		
	}

}
