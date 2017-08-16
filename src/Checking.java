
public class Checking extends Account{
	private final int MIN_AGE = 18;
	private int transactions;
	private final int MAX_TRANSACTIONS =10;
	public Checking (String name, double money, int age) {
		super(name, money, age);
		transactions = 0;
		if(age < MIN_AGE)
			canHaveAccount = false;
		else 
			canHaveAccount = true;
	}
	
	public boolean balanceFee () {
		if (balance <= 100) {
			balance -= 5;
			return true;
		}
		return false;
	}
	public double deposit(double deposit) {
		balance += deposit;
		transactions++;
		if(transactions > MAX_TRANSACTIONS){
			balance-=FEE;
		}
		return balance;
	}
	
	public double withdraw(double withdraw) {
		balance -= withdraw;
		transactions++;
		if(transactions > MAX_TRANSACTIONS){
			balance-=FEE;
		}
		return balance;
	}
	
}
