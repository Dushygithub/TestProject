package com.kodnest.methods;
import java.util.Scanner;
public class MethodType2 {

	public static void main(String[] args) {
		 Scanner scan=new Scanner (System.in);
		 System.out.println("enter the name");
		 String name=scan.next();
		 
		 learnjava(name);
		 
	}
	public static void learnjava(String name)
	{
		System.out.println(name);
	}

}
