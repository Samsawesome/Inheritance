
public class Checking extends Account{
	
	public Checking (String name, double money) {
		super(name, money);
	}
	
	public boolean balanceFee () {
		if (balance <= 100) {
			balance -= 5;
			return true;
		}
		return false;
	}
	
}
