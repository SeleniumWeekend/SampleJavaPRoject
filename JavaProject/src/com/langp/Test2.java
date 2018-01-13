package com.langp;

public class Test2 {

	String name;
	int id;
	Test2(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public boolean equals(Object o1)
	{
		String name1 = this.name;
		int id1 = this.id;
		
		Test2 t1 = (Test2)o1;
		
		String name2 = t1.name;
		int id2 = t1.id;
		
		if(name1.equals(name2) && id1==id2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args)
	{
		Test2 t1 = new Test2("pritam", 101);
		Test2 t2 = new Test2("pooja", 102);
		Test2 t3 = new Test2("pritam", 101);
		Test2 t4 = t1;
		
		System.out.println(t1.equals(t2)); //false
		System.out.println(t1.equals(t3)); // true
		System.out.println(t1.equals(t4)); // true
		
	}

}
