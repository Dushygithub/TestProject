package com.kodnest.String;

public class Findingcharacter {

	public static void findSameAlpha(String str1,String str2 ) {
		
		String newstr1=" ";
		String newstr2=" ";
		for(int i=0;i<=str1.length()-1;i++)
		{
			if(!newstr1.contains(str1.charAt(i)+" "))
				{
					newstr1=newstr1+str1.charAt(i);
				}
				
			}
			
			for(int i=0;i<=str2.length()-1;i++)
			{
				if(!newstr2.contains(str2.charAt(i)+" "))
				{
					newstr2=newstr2+str2.charAt(i);
				}
				
			}
			char[] arr1=newstr1.toCharArray();
			char[] arr2=newstr1.toCharArray();
			for(int i=0;i<=arr1.length-1;i++)
			{
				for(int j=0;j<=arr2.length-1;j++)
				{
					if(arr1[i]==arr2[j])
					{
					System.out.print(arr2[j]);
					}
				}
			}
			
		}
			
		
	      

	}


