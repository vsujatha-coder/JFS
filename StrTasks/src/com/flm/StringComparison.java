package com.flm;

public class StringComparison {
	public static void main(String[] args) {
		int var_a = 10;
		int var_b = 10;
		 
		String str_Literal1 ="sujatha";
		String str_Literal2 ="sujatha";
		
		String str_Obj1 = new String("sujatha");
		String str_Obj2 = new String("sujatha");
		
		
		
		
		System.out.println("var_a==var_b : "+(var_a==var_b) ); //primitive
		System.out.println("str_Literal1=str_Literal2 : "+(str_Literal1==str_Literal2));//String Literals
		System.out.println("str_Literal1.equals(str_Literal2) : "+(str_Literal1.equals(str_Literal2)));//String Literals
		System.out.println("str_Obj1==str_Obj2  : "+(str_Obj1==str_Obj2));//String Object
		System.out.println("str_Obj11.equals(str_Obj2 2) : "+(str_Obj1.equals(str_Obj2)));//String Object
		
		
	}
}
