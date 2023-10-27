package Kodnest;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
			
		}
		if(sum<=800) 
		{
			System.out.println("lift is work");
			
		}
		else
		{
			System.out.println("lift is not work");
		}
		
			
		
		
	}

}
