package finalExam;
import java.util.Date;
public class AccountTest {

	public static void main(String[] args) {
	
		Account x= new Account(1122, 20000); //account id and amount
		Account.setAnnualInterestRate(0.045);
		
		System.out.println("Initial Balance: "+x.getBalance());
		System.out.println("Monthly interest: "+(Account.getMonthlyInterest()));
		System.out.println("Date created: "+Account.getDateCreated().toString());
	
		double overdraft = 0;
		Account y= new CheckingAccount (1122, 20000, overdraft); //account id and amount
		Account.setAnnualInterestRate(0.045);
		y.withdraw(200);
		System.out.println("Withdraw amount from Checking: 200");
		System.out.println("Checking Account Balance: "+y.getBalance());
		
		Account z= new SavingsAccount(1122, 20000); //account id and amount
		Account.setAnnualInterestRate(0.045);
		z.deposit(3000);
		System.out.println("Deposit amount to Savings: 3000");
		System.out.println("Savings Account Balance: "+z.getBalance());
	}	
}
