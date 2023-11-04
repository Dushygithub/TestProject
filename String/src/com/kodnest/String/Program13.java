package com.kodnest.String;

public class Program13 {

	public static String reverseWordsOrder(String inputsentence) {
        // Split the sentence into words using space as the delimiter
        String[] words = inputsentence.split(" ");
        
        // Create a StringBuilder to build the reversed sentence
        StringBuilder a = new StringBuilder();
        
        // Iterate through the words in reverse order and append them to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            a.append(words[i]);
            if (i > 0) {
                a.append(" "); // Add space between words
            }
        }
        
        return a.toString();
    }

    public static void main(String[] args) {
        String inputSentence = "This is a sample sentence";
        String reversed = reverseWordsOrder(inputSentence);
        System.out.println("Original Sentence: " + inputSentence);
        System.out.println("Reversed Sentence: " + reversed);
    }
}
