import java.util.UUID;


public class CorporateAccount extends Account {

	public CorporateAccount(double nBalance, double nLimit) {
		this.accountNumber = UUID.randomUUID();
		this.balance = nBalance;
		this.creditLimit = nLimit;
		this.accountType = 3;
	}

}
