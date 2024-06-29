package inheritance_bank_accounts_exercise;

public class SavingsAccount extends BankAccount {

	double interestRate;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Interest Rate : " + interestRate + "%");
	}
	

}
