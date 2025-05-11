package com.flm;

import java.util.Arrays;
import java.util.Scanner;

public class SplitString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String str = sc.nextLine();
		
		String[] words = str.split(".");
		
		for(String word:words) {
			System.out.println(word);
			
		}
		System.out.println(Arrays.toString(words));
	}

}
