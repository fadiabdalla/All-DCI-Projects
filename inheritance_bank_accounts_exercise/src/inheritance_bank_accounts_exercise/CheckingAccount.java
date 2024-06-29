package inheritance_bank_accounts_exercise;

public class CheckingAccount extends BankAccount {

	double overdraftLimit;
	
	public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance = balance - amount;
            System.out.println();
        } else {
            System.out.println("The withdraw amount exceeds overdraft limit. Withdraw attempt REJECTED!");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Overdraft Limit: $" + overdraftLimit);
    }
	
}
