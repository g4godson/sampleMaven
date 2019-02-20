package com.flexon.devopsProject;

public class Calculator {
	
	public static Integer sum(Integer a, Integer b) {
		
		if(a==null || b==null) {
			return null;
		}
		return a+b;
	}
	
	public static Integer sub(Integer a, Integer b) {
		if(a==null || b==null) {
			return null;
		}
		return a-b;
	}
	
	public static Integer mult(Integer a, Integer b) {
		if(a==null || b==null) {
			return null;
		}
		return a*b;
	}

}
