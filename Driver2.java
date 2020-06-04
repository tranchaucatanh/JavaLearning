
//Canh Hanh Chi Tran
public class Driver2 {

	public static void main(String[] args) {	
		// Set account 1 balances of $2000.00
		System.out.print("First saver:\n");
		//Instantiate savingsAccount saver1 
		SavingsAccount account1 = new SpecialSavings(2000);
		account1.deposit(2000);
		account1.deposit(1500);
		account1.withdraw(320);
		account1.withdraw(300);
		account1.specialRate();
		
		
		System.out.println();
		
		// Setting account 2 balances of $3000.00
		System.out.print("Second saver:\n");
		//Instantiate savingsAccount saver2
		SavingsAccount account2 = new SpecialSavings(3000);
		account2.deposit(28000);
		account2.withdraw(200);
		account2.deposit(120080);
		account2.withdraw(50);
		account2.specialRate();
	}

}

//
/*  Testing embeded hardcode. No input value required. Can change hardcode value if needed.
 * 
 *  First saver:
 *  -Starting at: 2000
 *  -Deposit: 2000.0
 *  -Deposit: 1500.0
 *  -Withdraw: 320.0
 *  -Withdraw: 300.0
 *  
 *  Second saver:
 *  -Starting at: 3000
 *  -Deposit: 28000;
	-Withdraw: 200;
	-Deposit: 120080;
	-Withdraw: 50;
 * 
 *  OUTPUT 
 *  
	First saver:
	Starting saving balance: 2000.0
	
	Deposit: 2000.0
	New balances:  4000.00 
	
	Deposit: 1500.0
	New balances:  5500.00 
	
	Withdraw: 320.0
	New balances:  5180.00 
	
	Withdraw: 300.0
	New balances:  4880.00 
	Account balance is less than $10,000
	Applying...
	
	Annual Interest Rate: 4.0%
	Monthly Interest:  16.27 % 
	New balances:  4896.27 
	
	Second saver:
	Starting saving balance: 3000.0
	
	Deposit: 28000.0
	New balances:  31000.00 
	
	Withdraw: 200.0
	New balances:  30800.00 
	
	Deposit: 120080.0
	New balances:  150880.00 
	
	Withdraw: 50.0
	New balances:  150830.00 
	Account balance is more than $10,000
	Applying special rate...
	
	Annual Interest Rate: 10.0%
	Monthly Interest:  1256.92 % 
	New balances:  152086.92 

*/
