package com.kodnest.Practice;
import java.util.Scanner;
public class Findingthevalues {

	public static void main(String[] args) {
	 
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the String");
		String str=scan.nextLine();
		
		FindthevaluesApp f1=new FindthevaluesApp();
		f1.check(str);

	}

}
