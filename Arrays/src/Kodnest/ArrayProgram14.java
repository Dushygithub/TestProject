package Kodnest;

import java.util.Scanner;

public class ArrayProgram14 {

	public static void main(String[] args) {

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numer ");
		int row=scan.nextInt();
		int col=scan.nextInt();
		int[][] arr=new int[row][col];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				
				sum+=arr[i][j];
				System.out.print(arr[i][j]+" ");
				
			}
			
			System.out.println("="+sum);
		}
		System.out.println(sum);

	}

}
