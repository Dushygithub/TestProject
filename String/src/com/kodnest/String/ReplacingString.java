package com.kodnest.String;

import java.util.Scanner;

public class ReplacingString {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first name");
		String str1=scan.nextLine();
		System.out.println("Enter the key to replace");
		char key=scan.next().charAt(0);
		
		ReplacingStringApp a1=new ReplacingStringApp();
		a1.replace(str1,key);

	}

}
