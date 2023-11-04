package com.kodnest.String;
import java.util.Scanner;
public class Program6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=scan.nextInt();
		
		int[] arr=new int[a];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
			
			
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("Even");
				
			}
			else
			{
				System.out.println("odd")	;		}
		}

	}

}
