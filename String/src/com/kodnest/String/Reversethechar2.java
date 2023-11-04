package com.kodnest.String;

public class Reversethechar2 {

	public static void main(String[] args) {
		 String original = "i love you";
	        String reversed = reverseString(original);
	        System.out.println("Original: " + original);
	        System.out.println("Reversed: " + reversed);
	    }

	    public static String reverseString(String str) {
	        
	        StringBuilder reversed = new StringBuilder(str);
	        reversed.reverse();
	        return reversed.toString();

	}

}
