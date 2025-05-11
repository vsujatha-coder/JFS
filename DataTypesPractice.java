package com.jfs;

public class DataTypesPractice {
	public static void main(String[] args) {
		byte noOfEmployees=127;
		short EmpSalary=32767;
		int anualProduction=2147483647;
		long totalProduction =9223372036854775807L;
		float anualAvgProduction=16909320.055118f;
		double eachEmpTotalProduction = 7.2624976668116666d;
		char companyGrade = 'A';
		System.out.println("ABC company's Anual Production : "+anualProduction);
		System.out.println("ABC company's Total Production from its establishment : "+totalProduction);
		System.out.println("ABC company's No Of Employees : "+noOfEmployees);
		System.out.println("ABC company's each Employee Salary : "+EmpSalary);
		System.out.println("ABC company's Anual Average Production : "+anualAvgProduction);
		System.out.println("ABC company's Each Employee's Total Production : "+eachEmpTotalProduction);;
		System.out.println("ABC company's Grade : "+companyGrade);
	}

}
