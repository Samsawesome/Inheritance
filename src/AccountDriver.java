
public class AccountDriver {

	public static void main(String[] args) {
		Checking myChecking = new Checking ("Michael's checking", 100.0);
		Savings mySavings = new Savings ("Michael's savings", 1000.0, 0.05);
		
		myChecking.withdraw(10);
		System.out.println("New balance for checking account is " + myChecking.getBalance());
		
		mySavings.withdraw(10);
		mySavings.withdraw(10);
		mySavings.withdraw(10);
		mySavings.withdraw(10);
		mySavings.withdraw(10);
		mySavings.withdraw(10);
		mySavings.withdraw(10);
		System.out.println("New balance for savings account is " + mySavings.getBalance());
		
		mySavings.generateInterest();
		System.out.println("Generated interest for savings acct. New balance is " + mySavings.getBalance());
	}

}
