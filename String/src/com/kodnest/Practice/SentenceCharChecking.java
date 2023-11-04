package com.kodnest.Practice;

import java.util.Scanner;

public class SentenceCharChecking {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number: ");
        String str = scan.nextLine();
       
        String[] arr=str.split(" ");
        for(String x:arr)
        {
        	
        	int count=0;
        	char[] arr1=x.toCharArray();
        	for(int i=0;i<=arr1.length-1;i++)
        	{
        		
        		count++;
        	}
        	
        	System.out.println("character in "+x+" is "+":"+count);
        }
        

	}

}
