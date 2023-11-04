package com.kodnest.String;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the String 1");
		String str1=scan.nextLine();
		System.out.println("Enter the string 2");
		String str2=scan.nextLine();
		
		ProgramApp1 p1=new ProgramApp1();
		p1.check(str1,str2);

	}

}
