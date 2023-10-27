package LinearSearch;

import java.util.Scanner;

public class LinearSearch {

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
		System.out.println("Enter the key element");
		LinearSearchApp l1=new LinearSearchApp();
		l1.search(arr,ele);
		
		
	}

}
