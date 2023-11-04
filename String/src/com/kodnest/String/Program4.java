package com.kodnest.String;

public class Program4 {

	public static void main(String[] args) {
		String input = "Hello World";
        String reversed = reverseStringWithoutSpaces(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String without spaces: " + reversed);
    }

    public static String reverseStringWithoutSpaces(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);
            if (c != ' ') {
                reversed.append(c);
            }
        }
        return reversed.toString();

	}

}
