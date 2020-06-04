// Special saving class
public class SpecialSavings extends SavingsAccount {

	public SpecialSavings(double savingsBalance) {
		super(savingsBalance);
	}
	
	public void deposit(double newMoney){
		super.deposit(newMoney);
	}
	
	public void withdraw(double moneyWithdraw) {
		super.withdraw(moneyWithdraw);
	}
	
	public void calculateMonthlyInterest() {
			super.calculateMonthlyInterest();
	}
	
	public void specialRate() {
		if(getSavingsBalance() >10000) {
			System.out.println("Account balance is more than $10,000");
			System.out.println("Applying special rate...");
			modifyInterestRate(10);
			super.calculateMonthlyInterest();
		}
		else {
			System.out.println("Account balance is less than $10,000");
			System.out.println("Applying...");
			modifyInterestRate(4);
			super.calculateMonthlyInterest();
		}
		
	}
}
