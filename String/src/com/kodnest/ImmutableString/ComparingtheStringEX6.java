package com.kodnest.ImmutableString;

public class ComparingtheStringEX6 {

	public static void main(String[] args) {
		//creating the one string
		String s1="java";
		//Creating the another string
		String s2="java";
		//Creating the another string
		String s3=s1+s2;
		//Creating the another string
		String s4=s1+s2;
		//checking if the references value are equal
		if(s3==s4)
		{
			System.out.println("Both the reference are equal");
		}
		else
		{
			System.out.println("both reference are not equal");
		}
		//checking if the value are equal
		if(s3.equals(s4))
		{
			System.out.println("Both the value are equal");
		}
		else
		{
			System.out.println("Both the value are  not equal");
		}


	}

}
