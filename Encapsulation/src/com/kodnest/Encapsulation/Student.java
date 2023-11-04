package com.kodnest.Encapsulation;
import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the pin number ");
		int key=scan.nextInt();
		System.out.println("Enter the amount to withdraw");
		int amount=scan.nextInt();
		
		StudentApp s=new StudentApp();
		s.setdata(key,amount);
		s.getdata(key,amount);


}
}
