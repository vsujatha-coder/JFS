package com;

public class Thread1 extends Thread {
	
	BankAccount account;

    public Thread1(BankAccount account) {
        this.account = account;
    }
   
    @Override
    public void run() {
        account.deposit(500);
        account.withdraw(3000);
    }
}
