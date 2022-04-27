//오류의 원인을 찾고 Shape클래스를 수정하기
package com.javaex.ex03;

public class Shape {
	
	//필드
	protected String fillColor;		//private 로 되어있음 다른 클래스 상관관계 불가
	protected String lineColor;
	
	//생성자
	public Shape() {}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	//메소드
		public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	//메소드-일반
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}	
}

