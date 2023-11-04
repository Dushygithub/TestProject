package com.kodnest.String;
import java.util.Scanner;
public class FrequencyCheckApp {

	public static void main(String[] args) {
		//creating the scanner class
		Scanner scan=new Scanner(System.in);
		//displaying the string name
		System.out.println("enter the string");
		//entering the name
		String str=scan.nextLine();
		//converting string into char type
		
		//displaying the char type element
		
		
		FrequencyCheck f1=new FrequencyCheck();
		f1.check(str);
		
		
		
		
	}

}
