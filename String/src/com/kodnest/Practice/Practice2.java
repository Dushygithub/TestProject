package com.kodnest.Practice;
import java.util.Scanner;
public class Practice2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scan.nextLine();
		
		int sum=0;
		
		for(int i=0;i<=str.length();i++ )
		{
			sum=i;
		}
		
		System.out.println(sum);
	}

}
