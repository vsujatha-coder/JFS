package com;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		BankAccount bankAccount = new BankAccount();
		
		Thread1 t1 = new Thread1(bankAccount);
		t1.setName("Thread1");
		Thread2 t2 = new Thread2(bankAccount);
		t2.setName("Thread2");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Bank Account Balance is : "+bankAccount.balance);
		
	}

}
