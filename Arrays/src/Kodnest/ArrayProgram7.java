package Kodnest;

import java.util.Scanner;

public class ArrayProgram7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of players");
		int row=scan.nextInt();
		System.out.println("Enter the number of players");
		int col=scan.nextInt();
		
		float[][] arr=new float[row][col];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				System.out.println("Enter the teams ="+(i+1)+"height of the player ="+(j+1));
			      arr[i][j]=scan.nextFloat();
                
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				System.out.println("Enter the teams ="+(i+1)+"height of the player ="+(i+1)+" = "+arr[i][j]);
                
                
			}
		}
	}

}
