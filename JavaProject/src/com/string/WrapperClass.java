package com.string;

public class WrapperClass {

	public static void main(String[] args) 
	{

		// Integer Class
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer("10");
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));

		
		System.out.println(i1);
		System.out.println(i2);
		Integer i3 = new Integer("pritam"); // NumberFormatException
		System.out.println(i3);
		
		// Long Class
		
		Long l1 = new Long(10023);
		Long l2 = new Long("10023");
		
		System.out.println(l1.equals(l2));
		
		Long l3 = new Long("pritam");
		System.out.println(l3);
		
		
		// Float Class
		
		Float f1 = new Float(10.05f);
		Float f2 = new Float("10.05f");
		
		Float f3 = new Float(10.05);
		Float f4 = new Float("10.05");
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		
		System.out.println(f1.equals(f3));
		
		// Character class
		
		Character ch = new Character('A');
		
		System.out.println(ch);
		
		//boolean 
		
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean(false);
		
		Boolean b3 = new Boolean("true");
		
		Boolean b4 = new Boolean("True");
		
		Boolean b5 = new Boolean("False");
		
		Boolean b6 = new Boolean("Pritam");
		
		System.out.println(b1+" "+b2);
		
		System.out.println(b3);
		System.out.println(b4+" "+b5);
		
		System.out.println(b6);
		
		
	}

}
