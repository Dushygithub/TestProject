package com.kodnest.methods;

import java.util.Scanner;

public class method {
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static int multiple(int a,int b)
	{
		return a*b;
	}
	public static int div(int a,int b)
	{
		return a/b;
	}
	public static int mod(int a,int b)
	{
		return a%b;
	}

	public static void main(String[] args) {
		 Scanner scan=new Scanner (System.in);
		 System.out.println("enter the name");
		 int a=scan.nextInt();
		 System.out.println("enter the name");
		 int b=scan.nextInt();
		 
		  System.out.println(add(a,b));
		  System.out.println(sub(a,b));
		  System.out.println(multiple(a,b));
		  System.out.println(div(a,b));
		  System.out.println(mod(a,b));
		  

	}

}
