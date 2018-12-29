package com.spring.ObjectInjection;

public class Triangle3 {

	private String type;
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println(type + " Triangle Drawn" + " with points:");
		System.out.println("( "+getPointA().getX()+", "+getPointA().getY()+")");
		System.out.println("( "+getPointB().getX()+", "+getPointB().getY()+")");
		System.out.println("( "+getPointC().getX()+", "+getPointC().getY()+")");

		
	}
}
