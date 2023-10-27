package Kodnest;

import java.util.Scanner;

public class ArrayUsingString {

	public static void main(String[] args) {
		//creating array object
		String[] arr=new String[5];
		//storing name inside the array
		//creating the scanner class
		Scanner scan=new Scanner(System.in );
		System.out.println("Enter the company name");
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=scan.nextLine();
		}
		System.out.println("The name of the companys are");
		//displaying the name
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
