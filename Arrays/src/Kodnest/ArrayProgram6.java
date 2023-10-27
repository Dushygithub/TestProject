package Kodnest;
import java.util.Scanner;
public class ArrayProgram6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the row number");
int row=scan.nextInt();
System.out.println("Enter the column number");
int col=scan.nextInt();

int[][] arr=new int[row][col];
for(int i=0;i<=arr.length-1;i++)
{
	for(int j=0;j<=arr[i].length-1;j++) 
	{
		System.out.println("Enter the row number -"+(i+1)+"enter the column number -"+(j+1)+"=");
		arr[i][j]=scan.nextInt();
		
		
	}
}
for(int i=0;i<=arr.length-1;i++)
{
	for(int j=0;j<=arr[i].length-1;j++) 
	{
		System.out.println("Enter the row number -"+(i+1)+"enter the column number -"+(j+1)+"="+arr[i][j]);
		
		
	}

	}

}
}
