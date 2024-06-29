package thread_synchronization_exercise;

public class Depositor extends Thread {

	private BankAccount account;

	public Depositor(BankAccount account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			account.deposit(100);
		}
	}
}
