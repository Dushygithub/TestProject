package com.kodnest.String;
import java.util.Scanner; 
public class AnagramProgram {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=scan.nextLine();
		System.out.println("Enter the string");
		String str2=scan.nextLine();
		
		
		AnagramProgramApp a1=new AnagramProgramApp();
		a1.check(str1,str2);
				

	}

}
