package com.kodnest.String;

public class Reversethechar4 {

	public static void main(String[] args) {
		 int no=1221;
		 int temp=no;
		 int rev=0;
		 while(no>0)
		 {
			 
			 rev=rev*10+no%10;
			 no=no/10;
		 }
			 if(temp==rev)
			 {
				 System.out.println("palindrom");
			 }
			 else
			 {
				 System.out.println("not palindrom");
			 }
	    }
}
