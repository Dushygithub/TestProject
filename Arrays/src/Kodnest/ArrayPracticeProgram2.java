package Kodnest;

import java.util.Scanner;

public class ArrayPracticeProgram2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the element");
			arr[i]=scan.nextInt();
		}
		ArrayPracticeProgram02 a1=new ArrayPracticeProgram02();
        a1.array(n,arr);
		
	}

}
