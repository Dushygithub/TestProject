package com.kodnest.Encapsulation;

public class Constructor {
	
	private int id;
	private String name;
	private int age;
	private float percentage;
	
	public Constructor(int id,String name,int age,float percentage)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.percentage=percentage;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}
	
	public float getPercentage()
	{
		return percentage;
	}
	
	
}
