package com.string1;

public class Test3 {

	public static void main(String[] args)
	{

		String s1 =new String("JavaSelenium");
		
		String s2 =new String("JavaSelenium");
		
		String s3 = "JavaSelenium";
		String s4 = "JavaSelenium";
		
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		
		String s5 = "Java"+"Selenium";
		
		System.out.println(s3==s5);
		
		String s6 = "Java";
		
		String s7 = s6+"Selenium";
		System.out.println(s3==s7);
		
		final String s8 = "Java";
		
		String s9 = s8+"Selenium";
		System.out.println(s3==s9);
		
	}

}
