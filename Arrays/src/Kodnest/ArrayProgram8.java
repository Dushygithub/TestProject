package Kodnest;

import java.util.Scanner;

public class ArrayProgram8 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the in company");
		int row=scan.nextInt();
		
		String[][] arr=new String[row][];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the companys of employee"+(i+1));
			int col=scan.nextInt();
			arr[i]=new String[col];
			
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
			  System.out.println("Enter the number company"+(i+1)+"employee"+(j+1));
			  arr[i][j]=scan.next();
			  
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
			  System.out.println("Enter the number company"+(i+1)+"employee"+(j+1)+"="+arr[i][j]);
			    
			}
		}
		
	}

}
