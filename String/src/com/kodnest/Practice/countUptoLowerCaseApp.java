package com.kodnest.Practice;

import java.util.Scanner;

public class countUptoLowerCaseApp {

	public static void count(String str1) {
		int up=0;
		int low=0;
		String upstr="";
		String lowstr="";
		
		for(int i=0;i<=str1.length()-1;i++)
		{
			if(str1.charAt(i)>='A'&&str1.charAt(i)<='Z') 
			{
				up++;
				upstr=upstr+str1.charAt(i);
			}
			else if(str1.charAt(i)>='a'&&str1.charAt(i)<='z')
			{
				low++;
				lowstr=lowstr+str1.charAt(i);
			}
		}
		System.out.println(up);
		System.out.println(upstr);
		System.out.println(low);
		System.out.println(lowstr);

	}

}
