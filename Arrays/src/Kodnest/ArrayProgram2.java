package Kodnest;

import java.util.Scanner;

public class ArrayProgram2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the semester");
		int n=scan.nextInt();
		
		char[] arr=new char[n];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Is there any backlog in semester"+(i+1));
			arr[i]=scan.next().charAt(0);
			
		}
		for(int i=0;i<=arr.length-1;i++)
		{
		   System.out.println("the backlog in semester-"+(i+1)+"is"+arr[i]);
		}

	}
 
}
