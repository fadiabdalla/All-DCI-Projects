package functional_programming_3_exercise;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

class Account {
	private int accountNumber;
	private String accountHolder;
	private double balance;
	private String accountType;

	public Account(int accountNumber, String accountHolder, double balance, String accountType) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
		this.accountType = accountType;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit successful. New balance: $" + balance);
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal successful. New balance: $" + balance);
		} else {
			System.out.println("Insufficient funds!");
		}
	}

	public void transfer(Account destinationAccount, double amount) {
		if (amount <= balance) {
			balance -= amount;
			destinationAccount.deposit(amount);
			System.out.println("Transfer successful. New balance: $" + balance);
		} else {
			System.out.println("Insufficient funds for transfer!");
		}
	}
}

class Bank {
	private List<Account> accounts;
	private int nextAccountNumber;

	public Bank() {
		this.accounts = new ArrayList<>();
		this.nextAccountNumber = 1;
	}

	public void openAccount(String accountHolder, double initialBalance, String accountType) {

		Account newAccount = new Account(nextAccountNumber++, accountHolder, initialBalance, accountType);
		accounts.add(newAccount);
		System.out.println("Account opened successfully. Account number: " + newAccount.getAccountNumber());
	}

	public void displayAccounts() {
		System.out.println("Accounts in the Bank:");
		Function<Account, String> format = account -> "Account Number: " + account.getAccountNumber() + ", Age: "
				+ " - Holder: " + account.getAccountHolder() + " - Balance: $" + account.getBalance() + " - Type: "
				+ account.getAccountType();
		accounts.stream().map(format).forEach(System.out::println);
	}

	public List<Account> getAccounts() {
		return accounts;
	}
}

public class BankingSystemApp {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("\nBanking System Menu:");
				System.out.println("1. Open Account");
				System.out.println("2. Display Accounts");
				System.out.println("3. Deposit");
				System.out.println("4. Withdraw");
				System.out.println("5. Transfer");
				System.out.println("0. Exit");
				System.out.print("Enter your choice: ");
				int choice = scanner.nextInt();
				scanner.nextLine(); // Consume newline
				switch (choice) {
				case 1:
					System.out.print("Enter account holder name: ");
					String accountHolder = scanner.nextLine();
					System.out.print("Enter initial balance: $");
					double initialBalance = scanner.nextDouble();
					scanner.nextLine();
					System.out.print("Enter account type (Savings/Checking): ");
					String accountType = scanner.nextLine().toUpperCase();
					bank.openAccount(accountHolder, initialBalance, accountType);
					break;
				case 2:
					bank.displayAccounts();
					break;
				case 3:
					performTransaction(scanner, bank, "deposit");
					break;
				case 4:
					performTransaction(scanner, bank, "withdraw");
					break;
				case 5:
					performTransfer(scanner, bank);
					break;
				case 0:
					System.out.println("Exiting the Banking System. Goodbye!");
					scanner.close();
					System.exit(0);
				default:
					System.out.println("Invalid choice. Please try again.");
				}
			} catch (InputMismatchException e) {
				System.out.println("\nWrong input. Please enter a number.");
				scanner.nextLine();
			}
		}
	}

	private static void performTransaction(Scanner scanner, Bank bank, String transactionType) {
		System.out.print("Enter account number: ");
		int accountNumber = scanner.nextInt();
		System.out.print("Enter amount: $");
		double amount = scanner.nextDouble();
		scanner.nextLine(); // Consume newline
		// Predicate condition to check if the given account number fits with any
		// account number
		Predicate<Account> accountPredicate = a -> a.getAccountNumber() == accountNumber;

		// Method find account to find the account with a predicate
		Account account = findAccountByNumber(bank, accountPredicate);
		if (account != null) {
			// Function that takes two parameters, the amount and the method depending on
			// the word "deposit"
			Function<Double, Void> transaction = transactionType.equals("deposit") ? accAmount -> {
				account.deposit(accAmount);
				return null;
			} : accAmount -> {
				account.withdraw(accAmount);
				return null;
			};
			// call to the Function transaction with the apply method
			transaction.apply(amount);
		} else {
			System.out.println("Account not found!");
		}
	}

	private static void performTransfer(Scanner scanner, Bank bank) {
		System.out.print("Enter source account number: ");
		int sourceAccountNumber = scanner.nextInt();
		System.out.print("Enter destination account number: ");
		int destinationAccountNumber = scanner.nextInt();
		System.out.print("Enter transfer amount: $");
		double transferAmount = scanner.nextDouble();
		scanner.nextLine(); // Consume newline

		// Predicates to find source and destination account numbers
		Predicate<Account> sourceAccountPredicate = a -> a.getAccountNumber() == sourceAccountNumber;
		Predicate<Account> destinationAccountPredicate = a -> a.getAccountNumber() == destinationAccountNumber;

		Account sourceAccount = findAccountByNumber(bank, sourceAccountPredicate);
		Account destinationAccount = findAccountByNumber(bank, destinationAccountPredicate);
		if (sourceAccount != null && destinationAccount != null) {
			sourceAccount.transfer(destinationAccount, transferAmount);
		} else {
			System.out.println("One or both accounts not found!");
		}
	}

	// Method that takes an instance of the bank to be able to call the method
	// getAccounts() and the predicate that looks for the account as parameter
	private static Account findAccountByNumber(Bank bank, Predicate<Account> accountPredicate) {
		// create a list with all the accounts with the method getAccounts()
		List<Account> accounts = bank.getAccounts();
		// iterate and check if the account fulfill the predicate test()
		for (Account account : accounts) {
			if (accountPredicate.test(account)) {
				return account;
			}
		}
		return null;
	}
}