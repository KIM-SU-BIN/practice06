package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		//배열
		User c01 = new Customer("jws", "j1234", "정우성", 1000);
		User c02 = new Customer("yjs", "y2345", "이효리", 2000);
		User e01 = new Employee("master", "m7788", "운영자", 5000000);
		
		User[] user = new User[3];
		user[0] = c01;
		user[1] = c02;
		user[2] = e01;
		
		for(int i = 0; i < user.length; i++) {
			user[i].showInfo();
		}
	}
}
