package com.flm;

import java.util.Scanner;

public class StringReverseTask {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		
		StringReverseTask sr = new StringReverseTask();
		sr.StringReverse(s);
		
		sc.close();
		
		
		
	}
	
	void StringReverse(String s) {
		String result="";
		for(int i=s.length()-1;i>=0;i--) {
			result+=s.charAt(i);
		}
		System.out.println("Reverse of String : "+s+" is :"+result);
	}

}
