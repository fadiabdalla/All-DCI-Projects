package inheritance_bank_accounts_exercise;

public class Main {

	public static void main(String[] args) {

		SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountNumber(38100100);
        savingsAccount.setBalance(1704);
        savingsAccount.setInterestRate(3.5);

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setAccountNumber(3000012);
        checkingAccount.setBalance(3747);
        checkingAccount.setOverdraftLimit(1000);

        System.out.println("Savings Account Information:");
        savingsAccount.displayInfo();
        System.out.println("Depositing $1000 into Savings Account.");
        savingsAccount.deposit(1000);
        System.out.println("Withdrawing $2000 from Savings Account.");
        savingsAccount.withdraw(2000);
        savingsAccount.displayInfo();

        System.out.println("\nChecking Account Information:");
        checkingAccount.displayInfo();
        System.out.println("Withdrawing $4000 from Checking Account.");
        checkingAccount.withdraw(4000.0);
        System.out.println("Withdrawing $1000 from Checking Account.");
        checkingAccount.withdraw(1000.0);
        checkingAccount.displayInfo();
    }
}