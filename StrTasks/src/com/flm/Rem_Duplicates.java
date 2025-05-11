package com.flm;

public class Rem_Duplicates {
	public static void main(String[] args) {
		String old="program";
		int len_old=old.length();
		String new_w="";
		for(int i = 0; i<len_old;i++) {
			char current = old.charAt(i);
			int j;
			for(j = 0;j<new_w.length();j++) {
				if(current==new_w.charAt(j)) {
					break;
				}
				
			}
			if(j==new_w.length()) {
				new_w+=old.charAt(i);
			}
			
		}
		System.out.println(old);
		System.out.println(new_w);
	}

}
