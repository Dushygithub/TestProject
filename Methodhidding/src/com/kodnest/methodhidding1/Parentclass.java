package com.kodnest.methodhidding1;

public class Parentclass {
	public void add()
	{
		int a=10;
		int b=20;
		System.out.println("The addition of parent"+(a+b));
	}
	static public void sub()
	{
		int a=10;
		int b=20;
		System.out.println("The substraction of the parent is"+(b-a));
	}

}
