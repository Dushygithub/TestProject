package com.kodnest.ImmutableString;

public class ComparingtheStringEX2 {

	public static void main(String[] args) {
		//creating the one string
				String s1= new String("java");
				//Creating the another string
				String s2=new String("java");
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


	}

}
