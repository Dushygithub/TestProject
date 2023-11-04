package com.kodnest.String;
import java.util.Scanner;
public class uptolowandlowtoup {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String swapped = swapCase(input);

        System.out.println("String after swapping case: " + swapped);

        // Close the scanner
        scanner.close();
			
	}
	 public static String swapCase(String str) {
	char[] charArray = str.toCharArray();

    for (int i = 0; i <= charArray.length-1; i++) 
    {
    	char c = charArray[i];
        if (Character.isUpperCase(c)) 
        {
            charArray[i] = Character.toLowerCase(c);
        } 
        else if (Character.isLowerCase(c)) 
        {
          charArray[i] = Character.toUpperCase(c);
        }
    }

    return new String(charArray);
	 }
}
