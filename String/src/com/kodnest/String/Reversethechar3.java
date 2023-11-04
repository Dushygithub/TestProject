package com.kodnest.String;
import java.util.Scanner;
public class Reversethechar3 {

	public static void main(String[] args) 
	{
		 String input = "dushyanth";
	        String reversed = reverseString(input);
	        System.out.println("Original String: " + input);
	        System.out.println("Reversed String without swapping: " + reversed);
	    }

	    public static String reverseString(String input) {
	        char[] arr = input.toCharArray();
	        int j = arr.length;
	        char[] reversedArray = new char[j];
	        
	        for (int i = 0; i <j; i++) {
	            reversedArray[i] = arr[j-1-i];
	            
	           }

	        return new String(reversedArray);
    }	
	
}
