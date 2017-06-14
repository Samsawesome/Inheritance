
public class Savings extends Account {
	private double interestRate;
	private int withdrawals;
	private final int WITHDRAWAL_LIMIT = 6;
	
	// overrides Account constructor
	public Savings (String name, double money, double interestRate) {
		super(name, money);
		this.interestRate = interestRate;
		withdrawals = 0;
	}
	
	// overrides Account.withdraw
	public double withdraw (double withdraw) {
		withdrawals++;
		if (withdrawals > WITHDRAWAL_LIMIT)
			balance--; // transaction fee
		return super.withdraw(withdraw);
	}
	
	public double generateInterest () {
		return balance += balance * interestRate / 12;
	}
}
