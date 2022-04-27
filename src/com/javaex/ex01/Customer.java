package com.javaex.ex01;

public class Customer extends Person{
	
	//필드
	protected int cNo;
	protected int point;
	
	//생성자
	public Customer() {}
	
	public Customer(String name, String hp, int cNo, int point) {
		super(name,hp);
		this.cNo = cNo;
	}
	public Customer(int cNo, int point) {
		super();
		this.cNo = cNo;
		this.point = point;
	}
	
	
	//메소드
	public int getcNo() {
		return cNo;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
	//메소드-일반
	public void showInfo() {
		System.out.println("#고객번호=" + this.cNo +"," + "#포인트점수= " + this.point );
		super.showInfo();
	}
	
}
