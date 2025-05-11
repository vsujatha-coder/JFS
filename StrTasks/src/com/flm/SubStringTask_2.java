package com.flm;

import java.util.Scanner;

public class SubStringTask_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		
		SubStringTask_2 ss = new SubStringTask_2();
		ss.SubString(s);
		
		sc.close();
		
	}
	
	void SubString(String s) {
		
		for(int i = 0; i<=s.length()-1;i++) {
			for(int j = i ; j<=s.length()-1; j++) {
				System.out.print(s.substring(i,j+1)+" , ");
			}
		}
	}

}
