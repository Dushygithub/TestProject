package Kodnest;
import java.util.Scanner;
public class ArrayProgram11 {

	public static void main(String[] args) {
		
		int[][][] arr=new int[2][3][5];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the students age");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					arr[i][j][k]=scan.nextInt();
				}
			}
			
		}
		System.out.println("Enter the student age");
		
     
     for(int i=0;i<=arr.length-1;i++)
     {
    	 for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
    	 System.out.println("Enter the number school"+(i+1)+"and number of class"+(j+1)+"and age"+"="+arr[i][j][k]);
     }
	}
     }
	}
	

}
