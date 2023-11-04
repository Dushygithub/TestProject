package com.kodnest.Practice;

import java.util.Scanner;

public class SentenceChecking {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the sentence: ");
        String str = scan.nextLine();
        
      String[] arr=str.split(" ");
      int count=0;
      for(int i=1;i<=arr.length;i++)
      {
    	  count=i;
      }
      System.out.println("total number of words"+count);
      
      int sum=0;
    	  for(String x:arr)
          {
        	 
    		  System.out.println("The word-"+(sum+1)+":"+x.toUpperCase());
    		  sum++;
          }
    	  
      
      
      
      
        
	}

}
