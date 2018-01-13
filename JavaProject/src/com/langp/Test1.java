package com.langp;

public class Test1 
{

	String name;
	int id;
	Test1(String name, int id)
	{
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args)
	{
		System.out.println("MAIN START");
		Test1 t1 = new Test1("pritam", 101);
		Test1 t2 = new Test1("pooja", 102);
		Test1 t3 = new Test1("pritam", 101);
		Test1 t4 = t1;
		
		System.out.println(t1.equals(t2)); //false
		System.out.println(t1.equals(t3)); // false
		System.out.println(t1.equals(t4)); // true
		
	}

}
