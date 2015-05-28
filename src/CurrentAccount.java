import java.util.UUID;


public class CurrentAccount extends Account {
	
	public CurrentAccount(double nBalance, double nLimit) {
		this.accountNumber = UUID.randomUUID();
		this.balance = nBalance;
		this.creditLimit = nLimit;
		this.accountType = 1;
	}

}
