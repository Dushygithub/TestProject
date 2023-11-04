package Patterns;

import java.util.Scanner;

public class PatternProgram6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int row=scan.nextInt();
		
		System.out.println("enter the character");
		char ch =scan.next().charAt(0);

		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row-i+1;j++)
			{
			
			System.out.print(ch);
		}
			System.out.println();
		}
		

	}

}
