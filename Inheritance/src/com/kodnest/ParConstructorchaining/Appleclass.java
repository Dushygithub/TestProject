package com.kodnest.ParConstructorchaining;

public class Appleclass  extends Fruitclass
{
	
	
	public Appleclass(String color, String palce, int cost)
	{
		this("blue",700);
		this.color=color;
		this.palce=palce;
		this.cost=cost;
		System.out.println("three parameter constructor");
	}
	public Appleclass(String color, int cost)
	{
		this("pink");
		this.color=color;
		this.cost=cost;
		System.out.println("two parameter constructor");
	}
	public Appleclass(String color)
	{
		super("black");
		this.color=color;
		System.out.println("one parameter constructor");
		
	}

}
