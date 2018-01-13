package com.sample;

class D
{
	{
		System.out.println("D class1");
	}
	
	{
		System.out.println("D class2");
	}
	
	static 
	{
		System.out.println("Static block of D");
	}
	
	static void m1()
	{
		System.out.println("m1");
	}
}

public class NonStaticBlock {

	int i;
	
	{
		i=10;
		System.out.println("Non Static Block");
	}
	
	NonStaticBlock()
	{
		System.out.println("Default Const.");
	}
	
	public static void main(String[] args)
	{
		new D();
		D.m1();
		new NonStaticBlock();
		
	}

}
