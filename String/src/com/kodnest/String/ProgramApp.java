package com.kodnest.String;
import java.util.Scanner;
public class ProgramApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the String ");
		String str1=scan.nextLine();
		String str2=scan.nextLine();
		
		Program p1=new Program();
		p1.check(str1,str2);

	}

}
