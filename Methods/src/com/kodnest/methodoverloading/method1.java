package com.kodnest.methodoverloading;

public class method1 {
	public static void getMaggi()
	{
		System.out.println("bill for normal maggi is 30rs");
	}
	public static void getMaggi(int a)
	{
		System.out.println("bill for"+a+" normal maggi is"+(a*30)+"rs");
	}
	public static void getMaggi(String b)
	{
		System.out.println("bill for"+b+ "maggi is 50rs");
	}
	public static void main(String[] args) {
		getMaggi();
		int a=2;
		getMaggi(a);
		String b="chess";
		getMaggi(b);
		
		

	}

}
