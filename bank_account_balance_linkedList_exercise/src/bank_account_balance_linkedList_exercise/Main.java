package bank_account_balance_linkedList_exercise;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Double> accountBalances = new LinkedList<>();

        addAccount(accountBalances, 1000.0);
        addAccount(accountBalances, 1500.0);
        addAccount(accountBalances, 500.0);

        displayBalances(accountBalances);
    }

    public static void addAccount(LinkedList<Double> accountBalances, double initialBalance) {
        accountBalances.add(initialBalance);
    }

    public static void displayBalances(LinkedList<Double> accountBalances) {
        System.out.println("Account Balances:");
        for (int i = 0; i < accountBalances.size(); i++) {
            System.out.println("Account " + (i + 1) + ": $" + accountBalances.get(i));
        }
    }
}
