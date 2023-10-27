package Kodnest;
import java.util.Scanner;
public class ArrayInUserInput {

	public static void main(String[] args) {
		//creating array object
		int[] arr=new int[6];
		//storing value inside the array
		//creating the scanner class
		Scanner scan=new Scanner(System.in );
		System.out.println("Enter the value");
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("The value is");
		//displaying the value
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
