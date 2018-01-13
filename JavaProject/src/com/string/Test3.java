package com.string;

public class Test3 {

	public static void main(String[] args) 
	{

		String s1 = new String("Pritam");
		String s2 = new String("Pritam");
		
		System.out.println(s1==s2); // false
		System.out.println(s1.equals(s2)); // true
		
		StringBuffer s3 = new StringBuffer("Pritam");
		StringBuffer s4 = new StringBuffer("Pritam");
		
		System.out.println(s3==s4); // false 
		System.out.println(s3.equals(s4)); // false
		
		 
		
	}

}
