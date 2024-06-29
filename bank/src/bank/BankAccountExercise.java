package bank;


class BankAccount {
    private double accountBalance;
    
    
    public double getAccountBalance() {
        return accountBalance;
    }
    synchronized public void deposit(double amount) {
    	
    	
        accountBalance = accountBalance + amount;
        System.out.println("Deposit : "  + amount + "€." + "\tCurrent Balance: " + getAccountBalance());
    }
    synchronized public void withdraw(double amount) {
    	
        if (accountBalance >= amount) {
            accountBalance = accountBalance - amount;
            System.out.println("Withdraw :" + amount + "€." + "\tCurrent Balance: " + getAccountBalance());
        }}}
class Depositor extends Thread {
    private BankAccount bankAccount;
    public Depositor(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            double amount = 100;
            bankAccount.deposit(amount);
            
        }}}
class Withdrawal extends Thread {
    private BankAccount bankAccount;
    public Withdrawal(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            double amount = 50;
            if (bankAccount.getAccountBalance() >= amount) {
                bankAccount.withdraw(amount);
               
            } else {
                System.out.println("Account balance insufficient.");
            }}}}

public class BankAccountExercise {
    public static void main(String[] args) {
        BankAccount bankAccountMy = new BankAccount();
        Depositor depositor1 = new Depositor(bankAccountMy);
        Withdrawal withdrawal1 = new Withdrawal(bankAccountMy);
        depositor1.start();
        withdrawal1.start();

//        Secure that main Thread is going after Threads
        try {
            depositor1.join();
            withdrawal1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("- - -");
        System.out.println("Final Balance: " + bankAccountMy.getAccountBalance());}
}