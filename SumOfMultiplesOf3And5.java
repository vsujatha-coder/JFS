package com.flm;

import java.util.Scanner;

public class SumOfMultiplesOf3And5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num =sc.nextInt();
		
		SumOfMultiplesOf3And5 sm = new SumOfMultiplesOf3And5();
		sm.SumOfMul(num);
		
		sc.close();
		
		
	}
	
	void SumOfMul(int num) {
		int threeMul=0;
		int fivrMul=0;
		if(num>0) {
			for(int i=1;i<=num;i++) {
				if(i%3==0) {
					threeMul+=i;
				}
				if(i%5==0) {
					fivrMul+=i;
				}
			}
		}
		int total= threeMul+fivrMul;
		System.out.println("Total : "+total);
	}

}
