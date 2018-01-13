package com.string1;

public class Test2 {

	
	Test2(String s2)
	{
		System.out.println(s2);
	}
	
	public static void main(String[] args) 
	{
		
		
		String s1 = new String("Java");
		
		String s2 = new String("Java");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		Test2 t1 = new Test2("Java");
		Test2 t2 = new Test2("Java");

		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
		
	}

}
