import java.util.ArrayList;
import java.util.UUID;

import javax.swing.JOptionPane;


public abstract class Account {
	protected UUID accountNumber;
	protected double balance;
	protected double creditLimit;
	protected int accountType;
	protected boolean isAuthenticated;
	protected double interestRate;
	protected ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	
	public void openAccount(UUID customerId,String pw) {
		Authentication auth = new Authentication();
		this.isAuthenticated = auth.authenticate(customerId, pw);
		if (this.isAuthenticated) {
			JOptionPane.showMessageDialog(null, "Welcome to your interactive Bank Account, your Account-Type is: "
					+ this.getAccountType());
		}
		transactions.add(auth);
	}
	public void closeAccount() {
		this.isAuthenticated = false;
	}
	public void addAmountToBalance(double amount) {
		if (this.isAuthenticated) {
			this.balance += amount;
			Deposit deposit = new Deposit(amount);
			transactions.add(deposit);
		} else {
			System.out.println("not authenticated for setting interestRate");
		}
	}
	public void substractAmountToBalance(double amount) {
		if (this.isAuthenticated) {
			this.balance -= amount;
			Withdraw wdraw = new Withdraw(amount);
			transactions.add(wdraw);
		} else {
			System.out.println("not authenticated for setting interestRate");
		}
	}
	public void setInterestRate (double rate) {
		if (this.isAuthenticated) {
		this.interestRate = rate;
		} else {
			System.out.println("not authenticated for setting interestRate");
		}
	}
	public void setCreditLimit (double limit) {
		if (this.isAuthenticated) {
		this.creditLimit = limit;
		} else {
			System.out.println("not authenticated for setting interestRate");
		}
	}
	public String getAccountType() {
		String type = null;
		switch (this.accountType) {
		case 1: type = "Current Account";
				break;
		case 2: type = "Junior Account";
				break;
		case 3: type = "Corporate Account";
				break;
		case 4: type = "Student Account";
				break;
		default: type = "Account-Type not found!";
		}
		return type;
	};
	public double getBalance() {
		if (this.isAuthenticated) {
		return this.balance;
		} else {
			System.out.println("not authenticated for getting Balance");
			return 0;
		}
	}
	public ArrayList<Transaction> getTransactions () {
		return this.transactions;
	}
}
