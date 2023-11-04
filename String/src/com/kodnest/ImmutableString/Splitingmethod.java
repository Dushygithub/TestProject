package com.kodnest.ImmutableString;

public class Splitingmethod {

	public static void main(String[] args) {
		String s1="dushyanth";
		String[] arr=s1.split("u");
		System.out.println("after the split");
		for(String x:arr)
		{
			System.out.println(x);
		}

	}

}
