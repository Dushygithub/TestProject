package com.kodnest.ImmutableString;

public class FewInbulitmethodofString {

	public static void main(String[] args) {
		String s1="kodnest technologies PVT LTD";
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.startsWith("kod"));
		System.out.println(s1.startsWith("nest"));
		System.out.println(s1.endsWith("LTD"));
		System.out.println(s1.endsWith("pvt"));
		System.out.println(s1.contains("LTD"));
		System.out.println(s1.contains("java"));
		System.out.println(s1.indexOf("o"));
		System.out.println(s1.charAt(18));
		System.out.println(s1.substring(12));
		System.out.println(s1.substring(8,20));
	}

}
