package com.sample;

class C
{
	static
	{
		System.out.println("DB Connection");
	}
	
	static
	{
		System.out.println("DB Connection of C");
	}
	
	C()
	{
		System.out.println("Default Const.");
	}
}

public class Block1 {
	
	static 
	{
		System.out.println("Static block for Block1");
	}
	public static void main(String[] args)
	{
		System.out.println("Main Start");
		new C();
		
	}

}
