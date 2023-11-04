package com.kodnest.String;

public class Program15 {

	public static void main(String[] args) {
		
		String sentence = "tkfh dushyanth kodnest technologies";
        String longestWord = findLongestWord(sentence);
        
        System.out.println("Longest word in the sentence is: " + longestWord);
    }

    public static String findLongestWord(String sentence) {
       
        String[] words = sentence.split(" ");
        
        String longestWord = "";
        
        for (String word : words) {
            
           
           if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        return longestWord;

	}

}
