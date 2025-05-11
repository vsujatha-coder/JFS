package com.flm;

import java.util.Scanner;

public class SubStringTask {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		
		SubStringTask at = new SubStringTask();
		at.SubString(s);
		
		sc.close();
		
	}
	
	void SubString(String s) {
		for(int i=0;i<=s.length()-1;i++) {
			for(int j=i+1;j<=s.length();j++) {
				String result = s.substring(i,j);
				System.out.print(result+",");
			}
		}
	}

}
