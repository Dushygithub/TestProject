package com.kodnest.constractorchainind;

public class Tiger extends Animal 
{
	String sound="tiger roaring";
	
	void dispx() 
	{
		System.out.println("tiger is :"+sound);
	}
	void access()
	{
		super.dispx();
	}
}
