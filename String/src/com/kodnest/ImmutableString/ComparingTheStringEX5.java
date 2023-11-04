package com.kodnest.ImmutableString;

public class ComparingTheStringEX5 {

	public static void main(String[] args) {
		//creating the one variable
				String s1="java";
				//Creating the another variable
				String s2="java";
				//Creating the another variable
				String s3="java"+"sql";
				//Creating the another variable
				String s4="java"+"sql";
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
