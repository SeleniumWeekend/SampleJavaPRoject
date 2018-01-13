package com.string1;

public class Test9 {

	public static void main(String[] args) 
	{

			String s1 = "testing is fun";
			
			int i= s1.indexOf("testing");
			System.out.println(i);
			
			int j = s1.indexOf('i', 2);
			System.out.println(j);
			
			int k = s1.indexOf('i', 5);
			System.out.println(k);
			
			int n = s1.indexOf("fun", 5);
			System.out.println(n);
		
	}

}
