package com;

public class BankAccount {
	
	 String accountNumber;
	 String accountHolderName;
	 double balance = 0;

	 public synchronized void deposit(double amount) {
		 balance+=amount;
		 System.out.println(Thread.currentThread().getName() + " deposited: " + amount);
	 }
	 
	 public synchronized void withdraw(double amount){
		 if (balance >= amount) {
	            balance -= amount;
	            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount);
	        } else {
	            System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + " but insufficient balance.");
	        }
	 }
	 
	 public double getBalance() {
		 return balance;
	 }
	 
	 

}
