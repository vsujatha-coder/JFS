package com.flm;

public class Student_Class {
	int studentId;
	String name;
	boolean pass;
	int attandance;
	
	
	Student_Class(){
		System.out.println("WELCOME");
	}
	
	Student_Class(int std_id,String std_name,boolean std_pass,int std_attandance){
		studentId=std_id;
		name=std_name;
		pass=std_pass;
		attandance=std_attandance;
		
		
		
	}
	
	void PromoteToNextCls(boolean pass) {
		if(attandance>70){
			if(pass==true) {
				System.out.println(name + " is Promotted to next calss");
			}
			else {
				System.out.println(name+ " is not prometted to next class");
			}
		}
		
	}
	void allowToExam(int attandance) {
		
			if(attandance>70) {
				System.out.println(name+ " is allowed to write exams");
			}
			else {
				System.out.println(name+" is not allowed to write exams");
			
		}
		
	}

}
