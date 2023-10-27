package Kodnest;
import java.util.Scanner;
public class ArrayProgram4 {

	public static void main(String[] args) {
		
		 int[][] arr=new int[2][5];
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter the number");
 
  for(int i=0;i<=arr.length-1;i++)
  {
	  for(int j=0;j<=arr[i].length-1;j++)
	  {
		  arr[i][j]=scan.nextInt();
		  
	  }
	  
	  
  }
  
  for(int i=0;i<=arr.length-1;i++)
  {
	  for(int j=0;j<=arr[i].length-1;j++)
	  {
		  System.out.print(arr[i][j]);
	  }
	  System.out.println();
	  
  }
  

	}

}
