import java.util.UUID;


public class StudentAccount extends Account {

	public StudentAccount(double nBalance, double nLimit) {
		this.accountNumber = UUID.randomUUID();
		this.balance = nBalance;
		this.creditLimit = nLimit;
		this.accountType = 4;
	}

}
