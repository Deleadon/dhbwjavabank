import java.util.UUID;


public class JuniorAccount extends Account {

	public JuniorAccount(double nBalance, double nLimit) {
		this.accountNumber = UUID.randomUUID();
		this.balance = nBalance;
		this.creditLimit = nLimit;
		this.accountType = 2;
	}

}
