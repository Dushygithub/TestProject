package com.kodnest.methodhidding;

public class ParentclassApp {

	public static void main(String[] args) {
		
		Parentclass pc=new Parentclass();
		pc.display();
		
		
		Childclass1 cc= new Childclass1();
		cc.display();
		
		
		Parentclass pp=new Childclass1();
		pp.display();
		

	}

}
