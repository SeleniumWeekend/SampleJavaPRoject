package com.sample;

public class A1
{
	public static void main(String[] args) 
	{
		B1 b = new B1();
		System.out.println(b);
	}
}

class B1
{
	int i = 10;
	
	public int hashCode()
	{
		return 11;
	}
	
	public String toString()
	{
		 return "JAVA";
	}
	
}
