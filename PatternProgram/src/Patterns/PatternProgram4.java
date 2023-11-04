package Patterns;

import java.util.Scanner;

public class PatternProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int row=scan.nextInt();
		System.out.println("enter the number");
		int col=scan.nextInt();
		
		System.out.println("enter the character");
		char ch =scan.next().charAt(0);

		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
			
			System.out.print(ch);
		}
			System.out.println();
		}
		
	}

}
