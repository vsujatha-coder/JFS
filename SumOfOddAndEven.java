package com.flm;

import java.util.Scanner;

public class SumOfOddAndEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		
		if(num>0) {
			int evenCount=0;
			int oddCount=0;
			for(int i=1;i<=num;i++) {
				if(i%2==0) {
					evenCount+=i;
				}
				else if(i%2!=0) {
					oddCount+=i;
				}
			}
			System.out.println("Even Numbers Total: "+evenCount );
			System.out.println("Odd Numbers Total: "+oddCount);
			
		}
		sc.close();
		
	}
	
	

}
