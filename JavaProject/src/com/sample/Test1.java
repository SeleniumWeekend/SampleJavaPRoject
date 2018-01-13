package com.sample;

public class Test1 extends A
{
	public static void main(String[] args)
	{

		A a1 = new A();
		System.out.println(a1.i);
		Test1 t1 = new Test1();
		System.out.println(t1.i);
		System.out.println("Main");
		
	}

}

class A
{
	int i = 10; 
	private void m1()
	{
		System.out.println("M1");
	}
}

