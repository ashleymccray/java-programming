//This program will set an overdraft limit for CheckingAccount.

package finalExam;

public class CheckingAccount extends Account{
	
private double overdraft =-2000; //overdraft limit

public CheckingAccount(int id, double balance, double overdraft) {
super(id, balance);
this.overdraft = overdraft;
}


public double withDraw(double amount){
double b = getBalance();

if(b - amount >= overdraft){//verify the account has not met the overdraft amount
	double newBalance = b - amount;
	System.out.println("Your Checking Account Balance is" +	newBalance+ ".");
	return newBalance;//print balance of withdraw
}
else{//overdraft limits has been met
System.out.println("You have reached the maximum overdraft limit of" +overdraft+".");
setBalance(-overdraft);
return overdraft + getBalance();
}
}

@Override //invokes toString
public String toString() {
return "CheckingAccount [id=" + getid() + ", overdraft=" + overdraft + ", balance=" + getBalance()
+ ", monthlyInterest=" + getMonthlyInterest()
+ ", dateCreated=" + getDateCreated() + "]";
}

}