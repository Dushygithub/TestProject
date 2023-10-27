package Kodnest;

import java.util.Scanner;

public class ArrayProgram12 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number of cities");
          int city=scan.nextInt();
           
          int[][][] arr=new int[city][][];
          for(int i=0;i<=arr.length-1;i++)
          {
        	 
        	      System.out.println("Enter the number of company in city"+(i+1));
            	  int camp=scan.nextInt();
            	 arr[i]=new int[camp][];
            	  
          }
          for(int i=0;i<=arr.length-1;i++)
          {
        	  for(int j=0;j<=arr[i].length-1;j++)
        	  {
        		System.out.println("Enter the number of employee in city"+(i+1)+"company"+(j+1))  ;
        		int col=scan.nextInt();
        		arr[i][j]=new int[col];
        	  }
        	  
          }

          
        		  
         
          for(int i=0;i<=arr.length-1;i++)
          {
        	  for(int j=0;j<=arr[i].length-1;j++)
        	  {
        		  for(int k=0;k<=arr[i][j].length-1;k++)
        		  {
        			  System.out.println("Enter the number of cities"+(i+1)+"and company"+(j+1)+"and employee salary"+(k+1));
        			  arr[i][j][k]=scan.nextInt();
        		  }
        	  }
        		  
          }
          for(int i=0;i<=arr.length-1;i++)
          {
        	  for(int j=0;j<=arr[i].length-1;j++)
        	  {
        		  for(int k=0;k<=arr[i][j].length-1;k++)
        		  {
        			  System.out.println("Enter the number of cities"+(i+1)+"and company"+(j+1)+"and employee salary"+(k+1)+" "+arr[i][j][k]);
        			  
        		  }
        	  }
        		  
          }
	}

}
