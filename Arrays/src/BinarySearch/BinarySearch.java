package BinarySearch;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of the element");
		int[] arr=new int[scan.nextInt()];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the number "+(i+1));
			arr[i]=scan.nextInt();
		}
		int key=scan.nextInt();
		BinarySearchApp b1=new BinarySearchApp();
		b1.search(arr, key);

	}

}
