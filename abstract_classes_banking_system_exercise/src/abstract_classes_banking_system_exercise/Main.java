package abstract_classes_banking_system_exercise;

public class Main {

	public static void main(String[] args) {

		BankAccount savingsAccount = new SavingsAccount();
		BankAccount checkingAccount = new CheckingAccount();
		
		savingsAccount.setAccountHolder("Fadi");
		savingsAccount.setAccountNumber("DE38100100100986547");
		savingsAccount.setBalance(6256.37);
		((SavingsAccount) savingsAccount).setInterestRate(3.5);
		
		savingsAccount.displayAccountInfo();
		checkingAccount.deposit(300);
		checkingAccount.withdraw(100);
		System.out.println();
		
		checkingAccount.setAccountHolder("Sandy");
		checkingAccount.setAccountNumber("DE38100100100452778");
		checkingAccount.setBalance(1220.44);
		((CheckingAccount) checkingAccount).setOverdraftLimit(1220.44);
		checkingAccount.displayAccountInfo();
		checkingAccount.deposit(500);
		checkingAccount.withdraw(200);
		
	}

}
