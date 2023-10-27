package Kodnest;

import java.util.Scanner;

public class ArrayProgram18 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
			
			
		}
		int ele=scan.nextInt();
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==ele)
			{
				System.out.println("key is found"+i);
			}
			
			
		}
		

}
	}
