package Patterns;

import java.util.Scanner;

public class PatternProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number");
		int a=scan.nextInt();
		System.out.println("enter the character");
		char ch =scan.next().charAt(0);

		for(int i=1;i<=a;i++)
		{
			System.out.print(ch);
		}
	}

}
