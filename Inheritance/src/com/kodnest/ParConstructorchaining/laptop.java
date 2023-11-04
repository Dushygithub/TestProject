package com.kodnest.ParConstructorchaining;

public class laptop 
{
	String processor;
	String brand;
	int cost;
	
	public laptop()
	{
		super();
		System.out.println("zero parameterized");
	}
	public laptop(String processor)
	{
		this();
		this.processor=processor;
		System.out.println("one parameterized");
	}
	public laptop(String brand, int cost)
	{
		this("i3");
		this.brand=brand;
		this.cost=cost;
		System.out.println("two parameterized");
	}
	public laptop(String processor,String brand,int cost) 
	{
		this("dell",2764);
		this.processor=processor;
		this.brand=brand;
		this.cost=cost;
		System.out.println("Three parameterized");
		
	}
	
	public void disp()
	{
		System.out.println("The processor of is :"+processor);
		System.out.println("The brand of the laptop is :"+brand);
		System.out.println("the cost of the laptop is :"+cost);
	}
	

}
