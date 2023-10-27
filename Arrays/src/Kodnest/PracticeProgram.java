package Kodnest;
import java.util.Scanner;
public class PracticeProgram {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number");
		int cou=scan.nextInt();
		
		int[][][][][] arr=new int[cou][][][][];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the state in the country"+(i+1));
			int sts=scan.nextInt();
			arr[i]=new int[sts][][][];
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the distict of the state"+(j+1)+"of country"+(i+1));
				int dis=scan.nextInt();
				arr[i][j]=new int[dis][][];
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("Enter the company in distict"+(k+1)+"in state"+(j+1)+"int country"+(i+1));
					int comp=scan.nextInt();
					arr[i][j][k]=new int[comp][];
					
				}
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					for(int l=0;l<=arr[i][j][k].length-1;l++)
					{
						
					
					System.out.println("Enter the employee in company"+(l+1)+ "+in distict"+(k+1)+"in state"+(j+1)+"int country"+(i+1));
					int emp=scan.nextInt();
					arr[i][j][k][l]=new int[emp];
					}
				}
			}
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					for(int l=0;l<=arr[i][j][k].length-1;l++)
					{
						for(int m=0;m<=arr[i][j][k][l].length-1;m++)
						
						{
					System.out.println("Enter the salary of the employee"+(m+1)+"in company"+(l+1)+"in distict"+(k+1)+"in state"+(j+1)+"in country"+(i+1));
					arr[i][j][k][l][m]=scan.nextInt();
						}
					}
				}
			}
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;i++)
				{
					for(int l=0;l<=arr[i][j][k].length-1;l++)
					{
						for(int m=0;m<=arr[i][j][k][l].length-1;m++)
						
						{
					System.out.println("Enter the salary of the employee"+(m+1)+"in company"+(l+1)+"in distict"+(k+1)+"in state"+(j+1)+"in country"+(i+1)+arr[i][j][k][l][m]);
					
						}
					}
				}
			}
		}
		
		
	
		
		
	}

}
