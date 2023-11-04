package Kodnest;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
			
			
		}
		int key=scan.nextInt();
		BinarySearch01 b1=new BinarySearch01();
		b1.check(arr , key);


	}

}
