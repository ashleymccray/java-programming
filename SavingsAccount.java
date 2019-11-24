//This program will prevent the SavingsAccount from over drafting. 

package finalExam;

public class SavingsAccount extends Account {
	

	public SavingsAccount(int id, double balance) {
		super(id, balance);
		}

		public double withDraw(double amount){ // set withdraw field
		double b = getBalance();
		
		if(b >= amount){ // calculate the balance with the withdraw
			double newBalance = b - amount;
		return newBalance;
		}
		else { // verify the withdraw amount is less than the balance
		System.out.println("Your Savings account can not be overdrawn! Please choose another amount.");
		setBalance(0);
		return b;
		}
		}

		@Override // invokes toString
		public String toString() {
		return "SavingAccount [id=" + getid() + ", balance=" + getBalance()
		+ ", annualInterestRate=" + getAnnualInterestRate()
		+ ", dateCreated=" + getDateCreated() + "]";
		}
		
	}


