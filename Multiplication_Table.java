package com.flm;

import java.util.Scanner;

public class Multiplication_Table {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		
		Multiplication_Table mt = new Multiplication_Table();
		
		mt.MulTable(num);
		
		sc.close();
		
	}
	
	void MulTable(int num) {
		for(int i=1;i<=20;i++) {
			int result = i*num;
			System.out.println(num+" "+"X"+i+" "+" ="+result);
		}
	}

}
