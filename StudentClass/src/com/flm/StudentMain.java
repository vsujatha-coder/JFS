package com.flm;

public class StudentMain {
	public static void main(String[] args) {
		Student_Class st = new Student_Class();
		//student1
		Student_Class student1 = new Student_Class(1,"Akshar",true,85);
		
		System.out.println(student1.attandance);
		student1.allowToExam(student1.attandance);
		
		System.out.println(student1.pass);
		student1.PromoteToNextCls(student1.pass);
		
		
		//student2
		Student_Class student2 = new Student_Class(2,"Baskar",false,90);
		
		student2.allowToExam(student2.attandance);
		student2.PromoteToNextCls(student2.pass);
		
		//student3
		Student_Class student3 = new Student_Class(3,"Karthik",true,50);
		
		student3.allowToExam(student3.attandance);
		student3.PromoteToNextCls(student3.pass);
		
		//student4
		Student_Class student4 = new Student_Class(4,"vinay",false,50);
		student4.allowToExam(student4.attandance);
		student4.PromoteToNextCls(student4.pass);
		
	}

}
