package Kodnest;

import java.util.Scanner;

public class ArraryProgram19 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number of cities");
          int dis=scan.nextInt();
           
          int[][][] arr=new int[dis][][];
          for(int i=0;i<=arr.length-1;i++)
          {
        	 
        	      System.out.println("Enter the number of city"+(i+1));
            	  int city=scan.nextInt();
            	 arr[i]=new int[city][];
            	  
          }
          for(int i=0;i<=arr.length-1;i++)
          {
        	  for(int j=0;j<=arr[i].length-1;j++)
        	  {
        		System.out.println("Enter the number of city"+(i+1)+"company"+(j+1))  ;
        		int row=scan.nextInt();
        		arr[i][j]=new int[row];
        	  }
        	  
          }
          for(int i=0;i<=arr.length-1;i++)
          {
        	  for(int j=0;j<=arr[i].length-1;j++)
        	  {
        		  for(int k=0;k<=arr[i][j].length-1;k++)
        		  {
        			  System.out.println("Enter the number of employee in city"+(i+1)+"company"+(j+1))  ;
              		int col=scan.nextInt();
              		arr[i][j]=new int[col];
        			  
        		  }
        	  }
          }
          

          
         for(int i=0;i<=arr.length-1;i++)
          {
        	  for(int j=0;j<=arr[i].length-1;j++)
        	  {
        		  for(int k=0;k<=arr[i][j].length-1;k++)
        		  {
        			  for(int l=0;l<=arr[i][j].length-1;l++)
            		  {
            			
        			  System.out.println("Enter the number of distict"+(i+1)+"and city"+(j+1)+"and company"+(k+1)+"and employee name"+(l+1));
        			  arr[i][j][k]=scan.nextInt();
            		  }
        		  }
        	  }
        		  
          }
          for(int i=0;i<=arr.length-1;i++)
          {
        	  for(int j=0;j<=arr[i].length-1;j++)
        	  {
        		  for(int k=0;k<=arr[i][j].length-1;k++)
        		  {
        			  for(int l=0;l<=arr[i][j].length-1;l++)
            		  {
        			  System.out.println("Enter the number of distict"+(i+1)+"and city"+(j+1)+"and company"+(k+1)+"and employee name"+(l+1)+" "+arr[i][j][k]);
            		  }
        			  
        		  }
        	  }
        		  
          }
	}

}
