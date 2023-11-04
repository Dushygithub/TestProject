package com.kodnest.ParConstructorchaining;

public class Fruitclass 
{
	String color;
	String palce;
	int cost;
	public Fruitclass(String color)
	{
		this();
		this.color=color;
		System.out.println("super one parameter constructor");
	}
	public Fruitclass()
	{
		super();
		System.out.println("parameter constructor");
	}
	void display()
	{
		System.out.println("The apple color is"+color);
		System.out.println("The apple in the"+palce);
		System.out.println("The cost of the apple is"+cost);
	}

}
