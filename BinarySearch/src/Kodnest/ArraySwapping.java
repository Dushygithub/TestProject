package Kodnest;

import java.util.Scanner;

public class ArraySwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of number");
		int[] arr=new int[scan.nextInt()];
		System.out.println("before swapping");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the number"+(i+1));
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter 2 indexes to be swapped");
		int i1=scan.nextInt();
		int i2=scan.nextInt();
		int temp;
		

		
		System.out.println("Before swapping the array element are");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+" ");
			
			
		}
		
		if(i1>=0&&i1<=arr.length-1&&i2>=0&&i2<=arr.length-1 )
		{
			temp=arr[i2];
			arr[i2]=arr[i1];
			arr[i1]=temp;
		}
		else
		{
			System.out.println("Enter the indexes in the range of 0 the "+(arr.length-1));
			
		}
		System.out.println("after swapping the array element ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+" ");
			
			
		}
	
		
		
		
		

	}

}
