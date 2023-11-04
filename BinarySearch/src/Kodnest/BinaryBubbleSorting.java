package Kodnest;

import java.util.Scanner;

public class BinaryBubbleSorting {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int[] arr=new int[scan.nextInt()];
		//storing  element in array
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
			
		}
		//display element in array
		System.out.println("before the sorting the element");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+" ");
		}

	}

}
