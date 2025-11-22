package org.ycpait.BankApp;

import org.ycpait.BankApp.entity.Account;

public class BankApplication {

	public static void main(String[] args) {
		
		Account a = new Account(5000);
		Thread wife = new Thread(()-> a.withdraw(1000));
		wife.setName("Wife");
		
		Thread husband = new Thread(()-> a.deposit(1000));
		husband.setName("Husband");
//		a.withdraw(500);
//		a.deposit(1000);		
		wife.start();
		husband.start();
	}
}
