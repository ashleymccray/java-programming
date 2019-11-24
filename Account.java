/*This program will create an Account with a 
 * Checking and Savings and find the monthly interest rate
 */

package finalExam;

import java.util.Date;

public class Account {
	
	
	private int id; //determines the account id (default 0)
	private static double balance; //stores the account balance(default 0)
	private static double annualInterestRate; //stores the interest rate (default 0)
	private static Date dateCreated; //stores the date of when the account was created


//default account
	public Account () {
		
		id= 0;
		int initialBalance=0;
		annualInterestRate=0;
		dateCreated= new Date();
	
	
	}
	//constructor that creates an account with 
	//specified id and initial balance
	Account (int ID, double BALANCE){
		id= ID;
		balance= BALANCE;
		dateCreated= new Date();
	}
// accessor and mutator for id, balance, and annualInterestRate	
	public int getid() {
		return id;
	}
	
	public void setID(int a) {
		id =a;
		
	}
	
	public static double getBalance() {
		return balance;
	}
	public void setBalance (double b) {
		balance = b;
	}
	
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public static void setAnnualInterestRate( double c) {
		annualInterestRate= c;
	}
	
	// accessor for dateCreated
	public static Date getDateCreated() {
		
		return dateCreated; 
		
	}
	//returns monthly interest rate for an account
	public static double getMonthlyInteresRate() {
		
		double monthlyInterestRate= annualInterestRate/12; //divide by 12 months
		
		return monthlyInterestRate;
	}
	//returns monthly interest
	public static double getMonthlyInterest() {
		
		double monthlyInterestRate=0.0375;
		double monthlyInterest= monthlyInterestRate * balance;
		return monthlyInterest;
	}
	//method specifies the amount that is withdrawn
	public void withdraw (double amount) {
		balance -= amount;
	}
	//method specifies the amount deposited
	public void deposit (double amount) {
		balance += amount;
	}
}