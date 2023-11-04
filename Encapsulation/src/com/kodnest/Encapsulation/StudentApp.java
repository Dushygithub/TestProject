package com.kodnest.Encapsulation;

public class StudentApp {

	private int pin=5000;
	private int balance=10000;
	
	public void setdata(int key ,int amount)
	{
		if(key==pin) 
		{
			balance=balance-amount;
			
		}
		else
		{
			System.out.println("Invaild customer");
			System.exit(0);
		}
		
	}
	public void getdata(int key ,int amount)
	{
		if(key==pin) 
		{
			System.out.println("the given money is"+amount);
			System.out.println("The new balance is"+balance);
			
		}
		else
		{
			System.out.println("Invaild customer");
			System.exit(0);
		}
		
	}
}
