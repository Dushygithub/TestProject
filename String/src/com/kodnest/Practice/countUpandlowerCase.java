package com.kodnest.Practice;

import java.util.Scanner;

public class countUpandlowerCase {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=scan.nextLine();
		
	    countUptoLowerCaseApp c1=new countUptoLowerCaseApp();
	    c1.count(str1);
	}

}
