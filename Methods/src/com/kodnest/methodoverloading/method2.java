package com.kodnest.methodoverloading;

import java.util.Scanner;

public class method2 {
	public static int add(int a,int b) 
	{
		return a+b;
	}
	public static float add(float p,float q,float r) 
	{
		return p+q+r;
	}
	public static double add(double x,double y,double z) 
	{
		return x+y+z;
	}
	public static double add(float p,int a,double x) 
	{
		return a+p+x;
	}

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		float p=10.2f,q=20.5f,r=30.5f;
		double x=23.3,y=24.5,z=234.5;
		
		System.out.println(add(a,b));
		System.out.println(add(p,q,r));
		System.out.println(add(x,y,z));
		System.out.println(add(a,p,x));
	}

}
