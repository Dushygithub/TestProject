package com.kodnest.String;
import java.util.Scanner;
public class Program5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=scan.nextLine();
		char[] chars = str1.toCharArray();
        int length = chars.length;

        for (int i = 0; i < length / 2; i++) 
        {
            if (chars[i] != ' ' && chars[length - 1 - i] != ' ')
            {
                char temp = chars[i];
                chars[i] = chars[length - 1 - i];
                chars[length - 1 - i] = temp;
            } 
            else if (chars[i] == ' ') 
            {
                i++;
            } 
            else if (chars[length - 1 - i] == ' ')
            {
                length--;
            }
        }
		
		System.out.println(chars);
		
	}

}
