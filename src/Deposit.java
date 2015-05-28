import java.util.Date;


public class Deposit extends Transaction {
	public Deposit(double nAmount) {
		this.transactionType = 1;
		this.transactionTime = new Date();
		this.amount = nAmount;
	}
}
