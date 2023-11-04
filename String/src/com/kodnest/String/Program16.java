package com.kodnest.String;
import java.util.Scanner;
public class Program16 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scan.nextLine();
		
		int count=0;
		String[] arr=str.split(" ") ;
		for(String x:arr)
		{
		
			for(int i=0;i<=x.length();i++)
			{
				count=i;
				
			}
			
		}
		System.out.println(count);
		int up=0;
		int low=0;
		String upstr="";
		String lowstr="" ;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				up++;
				upstr=upstr+str.charAt(i);
				
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				low++;
				lowstr=lowstr+str.charAt(i);
				
			}
		}
		System.out.println(up);
		System.out.println(upstr);
		System.out.println(low);
		System.out.println(lowstr);
		
		
		

	}

}
