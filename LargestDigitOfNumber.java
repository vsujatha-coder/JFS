package com.flm;

import java.util.Scanner;

public class LargestDigitOfNumber {
	public static void main(String[] args) {
		
		int num=1;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number : ");
			num = sc.nextInt();
			
			LargestDigitOfNumber dn = new LargestDigitOfNumber();
			int largetDigit = dn.Larget(num);
			System.out.println("Largest Digit of "+num+" is "+largetDigit);
			
		}while(num>0);
		
		
		
		
	}
	int Larget(int num) {
		int largest = 0;
		while(num>0) {
			int rem=num%10;
			num=num/10;
			
			if(rem>largest) {
				largest=rem;
			}
		}
		return largest;
		
		
	}

}
