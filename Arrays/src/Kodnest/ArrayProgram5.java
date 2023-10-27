package Kodnest;

import java.util.Scanner;

public class ArrayProgram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the company name");
int row=scan.nextInt();
System.out.println("Enter the employee name");
int col=scan.nextInt();

String[][] arr=new String[row][col];
 for(int i=0;i<=arr.length-1;i++)
 {
	 for(int j=0;j<=arr[i].length-1;j++)
	 {
		 System.out.println("Enter the company name -"+(i+1)+" employee -"+(j+1)+"=");
		 arr[i][j]=scan.next();
		 
	 }
 }
 for(int i=0;i<=arr.length-1;i++)
 {
	 for(int j=0;j<=arr[i].length-1;j++)
	 {
		 System.out.println("Enter the company name"+(i+1)+arr[i][j]+"employee"+(j+1)+arr[i][j]);
		 
		 
	 }
 }
	}

}
