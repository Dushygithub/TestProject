package Patterns;

import java.util.Scanner;

public class PatternProgram11 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int row=scan.nextInt();
		System.out.println("enter the character");
		char ch =scan.next().charAt(0);
		
		for(int i=1;i<=row;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
			
			System.out.print("-");
		}
			for(int j=1;j<=11-2*i;j++)
			{
				System.out.print(ch);
				
			}
			System.out.println();
		}

	}

}
