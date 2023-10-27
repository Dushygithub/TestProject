package Kodnest;

import java.util.Scanner;

public class ArrayProgram3 {

	
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the semester");
			int n=scan.nextInt();
			
			String[] arr=new String[n];
			for(int i=0;i<=arr.length-1;i++)
			{
				System.out.println("Is there any backlog in semester"+(i+1));
				boolean a=scan.nextBoolean();
				if(a==true)
				{
					arr[i]="yes";
				}
				else
				{
					arr[i]="no";
				}
			}
	
			for(int i=0;i<=arr.length-1;i++)
			{
			   System.out.println("the backlog in semester-"+(i+1)+"is"+arr[i]);
		
			
			}
	}

}
