import java.util.ArrayList;
import java.util.UUID;

import javax.swing.JOptionPane;


public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Account> accounts = new ArrayList<Account>();
		for (int i=0;i<25;i++) {
		CurrentAccount cAccount = new CurrentAccount(5000, -666);
		JuniorAccount jAccount = new JuniorAccount(500, 0);
		CorporateAccount coAccount = new CorporateAccount(500000, -10000);
		StudentAccount sAccount = new StudentAccount(2000, -100);
		accounts.add(cAccount);
		accounts.add(jAccount);
		accounts.add(coAccount);
		accounts.add(sAccount);
		}
	}

}
