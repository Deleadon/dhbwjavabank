import java.util.Date;


public abstract class Transaction {
	
	protected double amount;
	protected Date transactionTime;
	protected int transactionType;
	
	public String getTransactionType() {
		String type = null;
		switch (this.transactionType) {
		case 1: type = "Deposit";
				break;
		case 2: type = "Withdraw";
				break;
		case 3: type = "Transfer";
				break;
		case 4: type = "Authenticate";
				break;
		default: type = "Transaction-Type not found!";
		}
		return type;
	};
}
