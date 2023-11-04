package com.kodnest.Practice;

import java.util.Scanner;

public class ReversetheString {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); 
       
        
        System.out.println("Reversed string: " + reverseString(input));
        
        
    }
    
   
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        
        
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
            
        }
        
        
        return reversed.toString();
    }
}
        
        		

