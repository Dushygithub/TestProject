package Kodnest;

import java.util.Scanner;

public class ArrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number of subject");
	int subject=scan.nextInt();
	
	String[] arr=new String[subject];
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("Enter the name of subject-"+(i+1));
		arr[i]=scan.next();
		
	}
	
for(int i=0;i<=arr.length-1;i++)
{
	System.out.println("Enter the name of subject-"+(i+1)+"is"+arr[i]);
}
	}

}
