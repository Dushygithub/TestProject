package com.kodnest.String;
import java.util.Scanner;
public class Findingthecharacter {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first name");
		String str1=scan.nextLine();
		System.out.println("Enter the first name");
		String str2=scan.nextLine();
		
		
		Findingcharacter n1=new Findingcharacter();
		n1.findSameAlpha(str1,str2);
	}

}
