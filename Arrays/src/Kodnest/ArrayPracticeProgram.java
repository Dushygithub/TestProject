package Kodnest;
import java.util.Scanner;
public class ArrayPracticeProgram {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter the number");
	
		for(int i=0;i<=arr.length-1;i++)
		{
			
			arr[i]=scan.nextInt();
			
		}
		System.out.println("the number of the element is");
		int ele=scan.nextInt();
		ArrayPraticeProgram01 A1=new ArrayPraticeProgram01();
		A1.array(ele,arr);
	
		
		

	}

}
