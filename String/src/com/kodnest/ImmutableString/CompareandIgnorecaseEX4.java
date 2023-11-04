package com.kodnest.ImmutableString;

public class CompareandIgnorecaseEX4 {

	public static void main(String[] args) {
		//creating the one string
				String s1="java";
				//Creating the another string
				String s2=new String("JAVA");
				//checking if the references value are equal
				if(s1==s2)
				{
					System.out.println("Both the reference are equal");
				}
				else
				{
					System.out.println("both reference are not equal");
				}
				//checking if the value are equal
				if(s1.equals(s2))
				{
					System.out.println("Both the value are equal");
				}
				else
				{
					System.out.println("Both the value are  not equal");
				}
				//checking if the value are equal after ignoring the case 
				if(s1.equalsIgnoreCase(s2))
				{
					System.out.println("Both the value are equal");
				}
				else
				{
					System.out.println("Both the value are not equal");
				}

	}

}
