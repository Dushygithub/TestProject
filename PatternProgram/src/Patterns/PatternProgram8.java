package Patterns;

import java.util.Scanner;

public class PatternProgram8 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int row=scan.nextInt();
		
		System.out.println("enter the character");
		char ch =scan.next().charAt(0);
		
		for(int i=1;i<=row;i++)
		{
			
			
			for(int j=1;j<=1;j++)
			{
				
				System.out.print(ch);
			}
			for(int j=2;j<=i;j++)
			{
				
				System.out.print(" ");
			}
			for(int j=1;j<=1;j++)
			{
				
				System.out.print(ch);
			}
			for(int j=2;j<=11-2*i;j++)
			{
				
				System.out.print(" ");
			}
			for(int j=1;j<=1;j++)
			{
				
				System.out.print(ch);
			}
			for(int j=2;j<=i;j++)
			{
				
				System.out.print(" ");
			}
			for(int j=1;j<=1;j++)
			{
				
				System.out.print(ch);
			}
			for(int j=1;j<=1;j++)
			{
				
				System.out.print("  ");
			}
			for(int j=1;j<=row;j++)
			{
				if(i==1||i==3||i==5||j==1)
				{
				System.out.print(ch);
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			for(int j=1;j<=1;j++)
			{
				
				System.out.print("  ");
			}
			for(int j=1;j<=1;j++)
			{
				
				System.out.print(ch);
			}
			for(int j=2;j<=i;j++)
			{
				
				System.out.print(" " );
			}
			for(int j=1;j<=1;j++)
			{
				
				System.out.print(ch);
			}
			for(int j=2;j<=row-i+1;j++)
			{
				
				System.out.print(" ");
			}
			for(int j=1;j<=1;j++)
			{
				
				System.out.print(ch);
			}
			for(int j=1;j<=1;j++)
			{
				
				System.out.print(" ");
			}
			for(int j=1;j<=row-i+1;j++)
			{
				
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(j==1||j==2*i-1||i==4)
				{
					System.out.print(ch);
					
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			
			
			
			System.out.println();
		}

	}

}
