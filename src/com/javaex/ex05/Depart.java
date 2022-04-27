package com.javaex.ex05;

public class Depart extends Employee {

	 //코드작성
	//필드
	protected String department;

	//생성자
	public Depart() {}
	
	public Depart(String name, int salary, String department) {
		super(name,salary);
		this.department = department;
	}


	//메소드 
	public String getdepartment() {
		return department;
	}

	public void setdepartment(String department) {
		this.department = department;
	}
	
	//메소드-일반
	public void showInformation() {
		 System.out.print("이름:" + getName() + "    연봉:" + getSalary() +  "	부서:"+department);
	}
	


}
