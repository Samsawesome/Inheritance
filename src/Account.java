
public abstract class Account {
	
	protected String name;
	protected double balance;
	protected int age;
	protected boolean canHaveAccount;
	
	public Account(String name, double money, int age, boolean canHaveAccount) {
		this.name = name;
		balance = money;
		this.age = age;
		this.canHaveAccount = canHaveAccount;
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
