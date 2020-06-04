// Saving account class
public class SavingsAccount {
	static double annualInterestRate = 0;
	private double savingsBalance = 0;
	
	protected SavingsAccount(double savingsBalance) {
		System.out.println("Starting saving balance: " + savingsBalance);
		this.savingsBalance = savingsBalance;
	}
	
	protected void calculateMonthlyInterest() {
		double monthlyIn;
		monthlyIn = (savingsBalance * annualInterestRate)/12;
		savingsBalance += monthlyIn;
		System.out.printf("%s %.2f %s \n", "Monthly Interest: ", monthlyIn, "%");
		System.out.printf("%s %.2f \n", "New balances: ", savingsBalance);
	}
	
	protected static void modifyInterestRate(double newValue) {
		System.out.println("\nAnnual Interest Rate: " + newValue + "%");
		annualInterestRate = newValue/100;
	}
	
	protected void deposit(double newMoney){
		System.out.println("\nDeposit: " + newMoney);
		savingsBalance += newMoney;
		System.out.printf("%s %.2f \n", "New balances: ", savingsBalance);
	}
	
	protected void withdraw(double moneyWithdraw) {
		System.out.println("\nWithdraw: " + moneyWithdraw);
		savingsBalance -= moneyWithdraw;
		System.out.printf("%s %.2f \n", "New balances: ", savingsBalance);
	}
	
	protected double getSavingsBalance() {
		return savingsBalance;
	}
	
	protected void specialRate() {
	
	}
}
