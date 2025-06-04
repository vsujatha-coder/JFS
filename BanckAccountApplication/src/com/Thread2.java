package com;

public class Thread2 extends Thread {
	BankAccount account;

    public Thread2(BankAccount account) {
        this.account = account;
    }
   
    @Override
    public void run() {
        account.deposit(5000);
        account.withdraw(3000);
    }

}

