package Accounts;

import java.io.Serializable;

public class MonthlyStatement  implements Serializable{
	//stringbuilder 
	//code a print String with transactions and fees
	//if savings account show interest gained
	//show beggining of month and end of month balance
	// include month name and year
	
	
	
	
	
	
}
/*package Accounts;

import java.io.Serializable;
import java.util.*;
import Accounts.*;
import Fees.*;
import Hardware.*;
public class MonthlyStatement  implements Serializable{

	private StringBuilder sb = new StringBuilder();
	private ArrayList<Fee> fees;
	private double begBalance, endBalance;
	private String monthAndYear;
	private BankAccount accnt;
	
	public MonthlyStatement() {
		this.begBalance = 0;
		this.endBalance = 0;
		this.monthAndYear = "January 2018";
		this.accnt = null;
		this.setFees(null);
		this.sb = null;
		
	}
	public MonthlyStatement(StringBuilder sb, ArrayList<Fee> fees, double begBalance, double endBalance, String monthAndYear, BankAccount accnt) {
		this.sb = sb;
		this.fees = fees;
		this.begBalance = begBalance;
		this.endBalance = endBalance;
		this.monthAndYear = monthAndYear;
		this.accnt = accnt;
		
	}
	public void addFee(Fee newFee) {
		this.fees.add(newFee);
	}
	
	public void setBegBalance(double begBal) {
		this.begBalance = begBal;
	}
	public double getBegBalance() {
		return this.begBalance;
	}
	
	public void setFees(ArrayList<Fee> fees) {
		this.fees = fees;
	}
	public ArrayList<Fee> getFee(){
		return this.fees;
	}
	
	public double getEndBalance() {
		return endBalance;
	}
	public void setEndBalance(double endBalance) {
		this.endBalance = endBalance;
	}
	
	public void setAccount(BankAccount accnt) {
		this.accnt = accnt;
	}
	public BankAccount getAccount() {
		return this.accnt;
	}
    
	public void printFees() {//if we only want to print fees
	
	sb.append("Fees for: "+monthAndYear+"\n");
	for(Fee f: fees) {
    sb.append(f+"\n");	
    }
	System.out.print(sb);
	sb.setLength(0);// clears the StringBuilder to avoid printing unwanted stuff

	}
	
	public void printTransactions() {// if we only want to print transactions
		sb.append("Transaction for: " +monthAndYear+"\n");
		for(Transaction t : this.accnt.getTransactions()) {
			sb.append(t+"\n");
			
			
		}
		System.out.print(sb);
		sb.setLength(0);//Clears the StringBuilder to avoid printing unwanted stuff

	}
	
	public void printInterest() {
		if(this.accnt.type() == "SavingsAccount") {
			
			sb.append("Interest gained for: "+monthAndYear+"\n");
			sb.append(this.accnt.monthlyInterest());
			System.out.print(sb);
			sb.setLength(0); // Clears StringBuilder to avoid printing unwanted stuff
			
			
			
		}
	}
	
	public double calcEndBal() {
		//double endBal = this.begBalance;
        for(Transaction t :this.accnt.getTransactions()) {
        	endBalance = endBalance + t.getAmmount();
        }
        for(Fee f : this.fees) {
        	endBalance = endBalance +f.getAmount();
        }
        if(this.accnt.type()=="SavingsAccount") {
        	endBalance = endBalance +this.accnt.monthlyInterest();
        }
        return endBalance;
	}	
	public void printBegEndBal() {
		this.calcEndBal();
		sb.append("Starting Balance for " +monthAndYear+": "+begBalance+ "\n");
		sb.append("Ending Balance for "+monthAndYear+": "+endBalance+"\n");
		System.out.print(sb);
		sb.setLength(0);
		
	}
	
	public void printMonthlyStatement() { // prints start , end balance, transactions, fees, and interest gained if savings account
		sb.append("Starting Balance for " +monthAndYear+": "+begBalance+ "\n");
		sb.append("Ending Balance for "+monthAndYear+": "+endBalance+"\n");
		sb.append("Fees for: "+monthAndYear+"\n");
		for(Fee f: fees) {
	    sb.append(f+"\n");	
	    }
		sb.append("Transaction for: " +monthAndYear+"\n");
		for(Transaction t : this.accnt.getTransactions()) {
			sb.append(t+"\n");
			}
		if(this.accnt.type() == "SavingsAccount") {
			
			sb.append("Interest gained for: "+monthAndYear+"\n");
			sb.append(this.accnt.monthlyInterest());
			}
		
	
	
	
	//code a print String with transactions and fees
	//if savings account show interest gained
	//show beggining of month and end of month balance
	// include month name and year
	
	
	
	
	
	
}
}
*/