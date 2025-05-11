package com.jfs.var;

public class variablePractice {
	
	static int age = 17;
	String name="ABC";
	
	public static void vote() {
		if(age>=18) {
			System.out.println("can cast vote");
		}
		else{
			System.out.println("can not cast vote");
		}
		
	}
	
	public void username() {
		variablePractice vr = new variablePractice();
		System.out.println(vr.name);
	}

}
