package com.kodnest.ImmutableString;

public class CompareTomethodEx1 {

	public static void main(String[] args) {
		//creating one variable
		String s1="java";
		//creating another variable
		String s2="javatech";
		//comparing the two variable with using the another variable
		int res=s1.compareTo(s2);
		if(res>0)
		{
			System.out.println("String s1 is greater");
		}
		else if(res<0)
		{
			System.out.println("String s2 is greater");
		}
		else
		{
			System.out.println("both string are equal");
		}

	}

}
