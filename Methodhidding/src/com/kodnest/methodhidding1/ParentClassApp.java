package com.kodnest.methodhidding1;



public class ParentClassApp {

	public static void main(String[] args) {
		Parentclass p1=new Parentclass();
		p1.add();
		p1.sub();
		Child1 c1=new Child1();
		c1.add();
		c1.sub();
		Child2 c2=new Child2();
		c2.add();
		c2.sub();
		Parentclass p2=new Child1();
		p2.add();
		p2.sub();
		Parentclass p3=new Child2();
		p3.add();
		p3.sub();

	}

}
