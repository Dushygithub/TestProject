package com.kodnest.methodoverloading;

public class methodoverloadindImplicit {
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static float add(float h,int b,float g)
	{
		return h+b-g;
	}
	public static double add(double a, int b)
	{
		return a-b;
	}

	public static void main(String[] args) {
		int a=10,b=20;
		float p=10.5f,q=20.5f;
		double x=10.33,y=20.13;
		
		System.out.println(add(a,b));
		System.out.println(add(p,b,q));
		System.out.println(add(x,b));
		
		

	}

}
