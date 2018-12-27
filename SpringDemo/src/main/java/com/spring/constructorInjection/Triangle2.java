package com.spring.constructorInjection;

public class Triangle2 {
	private String type;
	
	public Triangle2(String type) {
		this.type=type;
	}

	public void draw() {
		System.out.println(type + " Triangle Drawn");
	}
}
