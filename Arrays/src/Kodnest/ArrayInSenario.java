package Kodnest;

import java.util.Scanner;

public class ArrayInSenario {

	public static void main(String[] args) {
		//creating array object
		       int[] arr=new int[1];
				//storing name inside the array
				//creating the scanner class
				Scanner scan=new Scanner(System.in );
				System.out.println("Enter the passenger");
				for(int i=0;i<arr.length;i++)
				{
					 arr[i]=scan.nextInt();
				}
				
				
			
				//displaying the number
				for(int i=0;i<arr.length;i++)
				{
					if(i<=800)
					{
						System.out.println("Lift will work");
					}
					else
					{
						System.out.println("Lift will not work");
					}
					
				}
		
		
	}
}


