package com.kodnest.String;

public class Reversethechar {

	public static void main(String[] args) {
		String original = "i love you";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseString(String str) {
       
        char[] charArray = str.toCharArray();

      
        int left = 0;
        int right = charArray.length - 1;
        
        while (left < right) {
            // Swap characters at left and right pointers
        	char temp;
             temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move the pointers towards each other
            left++;
            right--;
           
        }
       // Convert the character array back to a string
        return new String(charArray);

	}

}
