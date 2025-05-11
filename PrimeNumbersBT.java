package com.flm;

import java.util.Scanner;

public class PrimeNumbersBT {
	public static void main(String[] args) {
		
		//Printing prime numbers between input number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		PrimeNumbersBT pn=new PrimeNumbersBT();
		pn.primeNumbers(num);
		sc.close();
	}
	
	
	void primeNumbers(int num) {
		
		for(int i=2;i<=num;i++) {
			
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count+=1;
				}
				
			}
			if(count<=2) {
				System.out.print(i+" ");
		   }
			
		}
			
			
	   }
	
}
