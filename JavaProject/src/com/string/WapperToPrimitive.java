package com.string;

public class WapperToPrimitive {

	public static void main(String[] args) {


		Integer i = new Integer("20");
		
		int j = i.intValue();
		
		System.out.println(j);
		
		Float f= 10.0f;
		
		float f1 = f.floatValue();
		
		System.out.println(f1);
		
		Character c = 'A';
		
		char ch = c.charValue();
		
		System.out.println(ch);
		
		
		
	}

}
