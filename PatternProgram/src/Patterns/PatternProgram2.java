package Patterns;

import java.util.Scanner;

public class PatternProgram2 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number");
		int a=scan.nextInt();
		System.out.println("enter the character");
		char ch =scan.next().charAt(0);

		for(int i=1;i<=a;i++)
		{
			System.out.println(ch);
		}

	}

}
