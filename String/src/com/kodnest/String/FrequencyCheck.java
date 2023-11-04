package com.kodnest.String;

public class FrequencyCheck {

	public static void check(String str) {
	    char[] arr=str.toCharArray();
		String newstr=" ";
		for(int i=0;i<=arr.length-1;i++)
		{
			if(!newstr.contains(str.charAt(i)+" "))
			{
				newstr=newstr+str.charAt(i);
			}
		}
		char[] arr1=newstr.toCharArray();
	
		for(int i=0;i<=arr1.length-1;i++)
		{
			int count=0;
			for(int j=0;j<=arr.length-1;j++)
			{
				if(arr1[i]==arr[j])
				{
					count++;
				}
			}
			System.out.println("the count of  "+ arr1[i]  +"is :"+count);
		}
		

	}

}
