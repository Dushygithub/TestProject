package Kodnest;

import java.util.Scanner;

public class ArrayProgram15 {

	public static void main(String[] args) {
		int[][] arr=new int[4][4];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number ");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			
			for(int j=0;j<=arr[i].length-1;j++)
			{
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
			
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			
			for(int j=0;j<=arr[i].length-1;j++)
			{
				if(i==0||j==0||i==arr.length-1||j==arr[i].length-1)
				{
					System.out.print(arr[i][j]+" ");
				}
				else
				{
					System.out.print("   ");
				}
				
				
			}
			System.out.println();
			
			
		}
		
		
		
		
	}

}
