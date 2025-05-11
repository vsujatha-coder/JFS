package com.flm;

import java.util.Scanner;

public class SumOfEvenAndOddNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num= sc.nextInt();
		
		SumOfEvenAndOddNumbers seo = new SumOfEvenAndOddNumbers();
		
		
		int EvenSum = seo.EvenTotal(num);
		int OddSum = seo.OddTotal(num);
		
		System.out.println("Even Numbers Sum :"+EvenSum);
		System.out.println("Odd Numbers Sum :"+OddSum);
		
		sc.close();
	}
	
	int EvenTotal(int num) {
		int eventTotal=0;
		
			for(int i=1;i<=num;i++) {
				if(i%2==0) {
					eventTotal+=i;
				}
			}
		
		return eventTotal;
		
	}
	
	int OddTotal(int num) {
		int oddTotal =0;
		
			for(int i=1;i<=num;i++) {
				if(i%2!=0) {
					oddTotal+=i;
				}
			}
		
		return oddTotal;
	}

}
