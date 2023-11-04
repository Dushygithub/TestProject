package com.kodnest.Practice;

import java.util.Scanner;

public class ConcatenatingString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=scan.nextLine();
		System.out.println("Enter the string");
		String str2=scan.nextLine();
		System.out.println(ConcatenatingStringApp.concat(str1,str2));

	}

}
