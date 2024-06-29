package handling_multiple_exceptions_in_a_banking_system_exercise;

import java.util.*;

public class BankingSystem {

	public static void main(String[] args) {

		ArrayList<BankAccount> accounts = new ArrayList<>();

		accounts.add(new BankAccount(123456789, 2646, 303));
		accounts.add(new BankAccount(567894321, 499, 303));
		accounts.add(new BankAccount(987654321, 1211, 303));

		try {
			deposit(987654321, 500, accounts);
			withdraw(123456789, 303, 1500, accounts);
		} catch (InsufficientFundsException e) {
			System.out.println("InsufficientFundsException: " + e.getMessage());
		} catch (InvalidPINException e) {
			System.out.println("InvalidPINException: " + e.getMessage());
		} catch (InvalidAccountNumberException e) {
			System.out.println("InvalidAccountNumberException: " + e.getMessage());
		}catch (Exception e) {
			System.out.println("Unknown Error: " + e.getMessage());
		}
	}

	static void withdraw(int accountNumber, int pin, double amount, ArrayList<BankAccount> accounts)
			throws InsufficientFundsException, InvalidPINException, InvalidAccountNumberException {
		BankAccount account = findAccount(accountNumber, accounts);

		if (account != null) {
			if (account.getPin() != pin) {
				throw new InvalidPINException("Incorrect PIN");
			} else {
				account.withdraw(amount);
				System.out.println("Withdrawal successful. New balance: $" + account.getBalance());
			}
		} else {
			throw new InvalidAccountNumberException("Invalid account number");
		}
	}

	static void deposit(int accountNumber, double amount, ArrayList<BankAccount> accounts)
			throws InvalidAccountNumberException {
		BankAccount account = findAccount(accountNumber, accounts);

		if (account != null) {
			account.deposit(amount);
			System.out.println("Deposit successful! $" + amount + " added. New balance: $" + account.getBalance());
		} else {
			throw new InvalidAccountNumberException("Invalid account number");
		}
	}

	static BankAccount findAccount(int accountNumber, ArrayList<BankAccount> accounts) {
		for (BankAccount account : accounts) {
			if (account.getAccountNumber() == accountNumber) {
				return account;
			}
		}
		return null;
	}
}
