
public abstract class Account {
	
	protected String name;
	protected double balance;
	
	public Account(String name, double money) {
		this.name = name;
		balance = money;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double deposit(double deposit) {
		return balance += deposit;
	}
	
	public double withdraw(double withdraw) {
		return balance -= withdraw;
	}
}
