import java.util.Date;
import java.util.UUID;

import javax.swing.JOptionPane;


public class Authentication extends Transaction {

	public Authentication() {
		this.transactionType = 4;
		this.transactionTime = new Date();
	}
	public boolean authenticate (UUID customerId, String pw) {
		boolean authenticated = false;
		if (JOptionPane.showConfirmDialog(null, "Are you a true account-owner?")==0) {
			authenticated = true;
		}
		return authenticated;
	}

}
