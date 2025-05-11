package com.jfs;

import java.util.Scanner;

public class ConditionalStmtsIfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks");
		int marks=sc.nextInt();
		if((marks>90)&&(marks<=100)) {
			System.out.println("Grade A");
		}
		else if((marks>70)&&(marks<=90)) {
			System.out.println("Grade B");
		}
		else if((marks>70)&&(marks<=50)) {
			System.out.println("Grade C");
		}
		else if(marks<50) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid");
		}
		
		sc.close();
	}

}
