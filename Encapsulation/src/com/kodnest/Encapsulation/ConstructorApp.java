package com.kodnest.Encapsulation;

public class ConstructorApp {

	public static void main(String[] args) {
		
		Constructor c1=new Constructor(12,"Dush",32,98.4f);
		System.out.println(c1.getId());
		System.out.println(c1.getName());
		System.out.println(c1.getage());
		System.out.println(c1.getPercentage());
		Constructor c2=new Constructor(12,"prerana",32,98.4f);
		System.out.println(c2.getId());
		System.out.println(c2.getName());
		System.out.println(c2.getage());
		System.out.println(c2.getPercentage());

	}

}
