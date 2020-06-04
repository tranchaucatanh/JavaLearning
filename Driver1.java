// Driver 1 part 1
public class Driver1 {

	public static void main(String[] args) {
		
		// Set account 1 balances of $2000.00
		System.out.print("First saver:\n");
		//Instantiate savingsAccount saver1 
		SavingsAccount account1 = new SavingsAccount (2000);
		SavingsAccount.modifyInterestRate(4);
		account1.calculateMonthlyInterest();
		SavingsAccount.modifyInterestRate(5);
		account1.calculateMonthlyInterest();
		
				
				
		System.out.println();
				
		// Setting account 2 balances of $3000.00
		System.out.print("Second saver:\n");
		//Instantiate savingsAccount saver2
		SavingsAccount account2 = new SavingsAccount(3000);
		SavingsAccount.modifyInterestRate(4);
		account2.calculateMonthlyInterest();
		SavingsAccount.modifyInterestRate(5);
		account2.calculateMonthlyInterest();
		
	}

}

// OUTPUT
// testing saver1 and saver2 with balances of $2000.00 and $3000.00, respectively. 
// Annual InterestRate to 4%, calculate the monthly interest and print the new balances.
// set Annual Interest Rate to 5%, calculate the monthly interest and print the new balances.
/*
 * First saver:
	Starting saving balance: 2000.0
	
	Annual Interest Rate: 4.0%
	Monthly Interest:  6.67 % 
	New balances:  2006.67 
	
	Annual Interest Rate: 5.0%
	Monthly Interest:  8.36 % 
	New balances:  2015.03 
	
	Second saver:
	Starting saving balance: 3000.0
	
	Annual Interest Rate: 4.0%
	Monthly Interest:  10.00 % 
	New balances:  3010.00 
	
	Annual Interest Rate: 5.0%
	Monthly Interest:  12.54 % 
	New balances:  3022.54 

*/	
