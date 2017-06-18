
public class Checking extends Account{
	private final int MIN_AGE = 18;
	private int transactions;
	private final int MAX_TRANSACTIONS =10;
	public Checking (String name, double money, int age, boolean canHaveAccount) {
		super(name, money, age, canHaveAccount);
		if(age < MIN_AGE){
			canHaveAccount = false;
		}
	}
	
	public boolean balanceFee () {
		if (balance <= 100) {
			balance -= 5;
			return true;
		}
		return false;
	}
	public boolean maxTransactions(){
		if (transactions > MAX_TRANSACTIONS){
			balance -= 10;
			return true;
		}
		return false;
	}
	
}
