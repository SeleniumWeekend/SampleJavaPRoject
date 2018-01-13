package com.string;

public class Parse {

	public static void main(String[] args) 
	{

		String s1 = "10";
		
		int j = Integer.parseInt(s1);
		System.out.println(j);
		float f = Float.parseFloat(s1);
		System.out.println(f);
		
		boolean b = Boolean.parseBoolean(s1);
		
		System.out.println(b);
	}

}
