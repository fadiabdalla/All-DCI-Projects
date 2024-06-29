package wait_and_notify;

class Account {

	int amount = 20000;

	synchronized void withdraw(int amount) {
		
		System.out.println("Withdrawing...");
		
		if(this.amount < amount) {
			
			System.out.println("Insufficient funds! Please deposit...");
			
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		this.amount -= amount;
		System.out.println("Withdraw completed! : " + this.amount);
	}

	synchronized void deposit(int amount) {
		
		System.out.println("Depositing...");
		this.amount += amount;
		System.out.println("Deposit completed! : " + this.amount);
		notify();

	}

}

public class Main {

	public static void main(String[] args) {

		
		Account acc = new Account();
		new Thread () {
			public void run() {
				
				acc.withdraw(25000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				acc.deposit(6000);
			}
		}.start();
		
	}

}
