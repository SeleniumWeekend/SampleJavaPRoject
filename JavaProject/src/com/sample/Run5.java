package com.sample;

public class Run5 
{
	public static void main(String[] args)
	{
		
		Student1 s1 = new Student1("JAVA", 101);
		System.out.println(s1);
		System.out.println(s1.toString());
		
		AAA a1 = new AAA();
		System.out.println(a1);
		
		AAA a2 = new AAA();
		System.out.println(a2);
	}
}

class AAA
{
	
}

class Student1
{
	String name;
	int id;
	
	public String toString()
	{
		return name+" "+id;
	}
	
	Student1(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	void m1()
	{
		System.out.println(name+" "+id);
	}
}
