package com.kodnest.String;

public class ReplacingStringApp {

	public static void replace(String str1,char key) {
		StringBuilder x= new StringBuilder();
		
		for(int i=0;i<=str1.length()-1;i++)
		{
			char ch=str1.charAt(i);
			if(ch==key)
			{
				x.append("99");
				
			}
			else
			{
				x.append(ch);
			}
		}
		System.out.println(x);
		
		
		

	}

}
