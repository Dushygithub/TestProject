package Kodnest;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=scan.nextInt();
		System.out.println("Enter the second number");
		int num2=scan.nextInt();
		
		System.out.println("before swapping"+" num1 :"+num1);
		System.out.println("before swapping"+" num2 :"+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("after swapping"+" num1 :"+num1);
		System.out.println("after swapping"+" num2 :"+num2);
		

	}

}
