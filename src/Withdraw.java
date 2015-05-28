import java.util.Date;


public class Withdraw extends Transaction {

	public Withdraw(double nAmount) {
		this.amount = nAmount;
		this.transactionType = 2;
		this.transactionTime = new Date();
	}

}
