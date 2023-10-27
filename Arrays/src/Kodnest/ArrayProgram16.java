package Kodnest;

import java.util.Scanner;

public class ArrayProgram16 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numer of matrix-1and matrix-2 ");
		int row=scan.nextInt();
		int col=scan.nextInt();
		int[][] matrix1=new int[row][col];
		int[][] matrix2=new int[row][col];
		int[][] resultmatrix1=new int[row][col];
		System.out.println("Enter the element of matrix1 ");
		for(int i=0;i<=matrix1.length-1;i++)
		{
			for(int j=0;j<=matrix1[i].length-1;j++)
			{
				matrix1[i][j]=scan.nextInt();
				
			}
			
		}
		System.out.println("Enter the element of matrix2");
		for(int i=0;i<=matrix2.length-1;i++)
		{
			for(int j=0;j<=matrix2[i].length-1;j++)
			{
				matrix2[i][j]=scan.nextInt();
				
			}
			
			
		}
		for(int i=0;i<=resultmatrix1.length-1;i++)
		{
			for(int j=0;j<=resultmatrix1[i].length-1;j++)
			{
				resultmatrix1[i][j]= matrix1[i][j]+matrix2[i][j];
			}
		}
		
		for(int i=0;i<=resultmatrix1.length-1;i++)
		{
			for(int j=0;j<=resultmatrix1[i].length-1;j++)
			{
				System.out.print(resultmatrix1[i][j]+" ");
			}
			System.out.println();
				
			}
			
			
		
	}
}



	
		
				
