package Kodnest;

import java.util.Scanner;

public class ArrayUsingFloat {

	public static void main(String[] args) {
		//creating array object
				float[] arr=new float[5];
				//storing percentage inside the array
				//creating the scanner class
				Scanner scan=new Scanner(System.in );
				System.out.println("Enter the marks");
				for(int i=0;i<arr.length;i++) 
				{
					arr[i]=scan.nextFloat();
				}
				System.out.println("The marks of the student is");
				//displaying the percentage
				for(int i=0;i<arr.length;i++)
				{
					System.out.println(arr[i]);
				}

	}

}
