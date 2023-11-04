package com.kodnest.methods;

import java.util.Scanner;

public class MethodType4 {

	public static void main(String[] args) {
		 Scanner scan=new Scanner (System.in);
		 System.out.println("enter the name");
		 String name=scan.next();
		 
		 String a=learnjava(name);
		 
	}
	public static String learnjava(String name)
	{
		return name;
	}

	}


