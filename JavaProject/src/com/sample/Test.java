package com.sample;

public class Test 
{
	
	int a = 1000;
	int b = 2000;
	
	static int c = 3000;
	static int d = 4000;
	
	void m1(int a, char ch)
	{
		
		System.out.println(a);
		System.out.println(ch);
	}
	
	void m2(int a, int b, int c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	static void m3(String s1)
	{
		System.out.println(s1);
	}
	
	static void m4(String s1, String s2)
	{
		System.out.println(s1);
		System.out.println(s2);
	}
	
	Test(char ch, boolean b)
	{
		System.out.println(ch);
		System.out.println(b);
	}
	
	Test(int a)
	{
		System.out.println(a);
	}
	
	
	public static void main(String[] args) 
	{

		Test t1 = new Test('s', true);
		Test t2 = new Test(10);
		
		System.out.println(t1.a);
		System.out.println(t2.b);
		
		System.out.println(c);
		System.out.println(d);
		
		t1.m1(100, 's');
		t2.m2(100, 200, 300);
		
		m3("pritam");
		m4("anu", "dhanu");
		
		
	}

}
