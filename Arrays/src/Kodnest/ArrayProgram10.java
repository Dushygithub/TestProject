package Kodnest;

import java.util.Scanner;

public class ArrayProgram10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of school");
		int row=scan.nextInt();
		System.out.println("Enter the number of school");
		int col=scan.nextInt();
		System.out.println("Enter the number of school");
		int clas=scan.nextInt();
		
		int[][][] arr=new int[row][col][clas];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					
					System.out.println("Enter the school"+(i+1)+"classrooms"+(j+1)+"students"+(k+1));
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					
					System.out.println("Enter the school"+(i+1)+"classrooms"+(j+1)+"students"+(k+1)+arr[i][j][k]);
					
				}
			}
		}
		

	}

}
