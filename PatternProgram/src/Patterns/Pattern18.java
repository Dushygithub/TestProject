package Patterns;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int row=scan.nextInt();
		
		
		
		for(int i=1;i<=row;i++)
		{
			
			for(int j=1;j<=row-i+1;j++)
			{
			
			System.out.print("-");
		}
			for(int j=1;j<=i;j++)
			{
				
					System.out.print(i+" ");	
			}
			System.out.println();
		}
		

	}

}
