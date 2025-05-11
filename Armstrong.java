package com.flm;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		
		int num=1;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a Number");
			num = sc.nextInt();
			
			Armstrong am = new Armstrong();
			
			int total = am.sumOfPow(num);
			if(total==0) {
				System.out.println("Exit");
			}
			else if(total==num){
				System.out.println(num + " is an Armstrong");
			}
			
			else {
				System.out.println(num + " is not an Armstrong");
			}
			
			
			
		}while(num>0);
		
		
	}
	
	int countOfNum(int num) {
		int count=0;
		while(num>0) {
			num=num/10;
			count+=1;
		}
		return count;
		
	}
	
	int sumOfPow(int num) {
       Armstrong am = new Armstrong();
		
		int count = am.countOfNum(num);
		int result=0;
		while(num>0) {
			int rem=num%10;
			num=num/10;
			result+=Math.pow(rem, count);
		}
		return result;
	}

}
