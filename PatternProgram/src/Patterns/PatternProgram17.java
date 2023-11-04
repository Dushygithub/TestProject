package Patterns;

import java.util.Scanner;

public class PatternProgram17 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int a=scan.nextInt();
		System.out.println("Enter the charater");
		char ch=scan.next().charAt(0);
		
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=a;j++)
			{
				if(i==1||i==a)
				{
					System.out.print("*");
				}
				else
				{
					if(i==5||j==5)
					{
						System.out.print("*");
						
					}
					else
					{
						System.out.print(" ");
					}
				}
				
			}
			System.out.println();
		}
	}

}
