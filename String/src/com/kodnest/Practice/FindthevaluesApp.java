package com.kodnest.Practice;

public class FindthevaluesApp {

	public static void check(String str) {
		int low=0;
		int up=0;
		int num=0;
		int sp=0;
		String lowstr=" ";
		String upstr=" ";
		String numstr=" ";
		String spstr=" ";
		char[] arr=str.toCharArray();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
			{
				up++;
				upstr=upstr+str.charAt(i);
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
			{
				low++;
				lowstr=lowstr+str.charAt(i);
				
			}
			else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
			{
				num++;
				numstr=numstr+str.charAt(i);
				
			}
			else
			{
				sp++;
				spstr=spstr+str.charAt(i);
			}
			
			
		}
		System.out.println(low);
		System.out.println(lowstr);
		System.out.println(up);
		System.out.println(upstr);
		System.out.println(num);
		System.out.println(numstr);
		System.out.println(sp);
	   System.out.println(spstr);
		
		
	
		
	}

}
