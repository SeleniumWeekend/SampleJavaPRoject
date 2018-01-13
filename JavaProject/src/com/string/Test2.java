package com.string;

public class Test2 {

	public static void main(String[] args) {

		String s1 = new String("Pritam");
		
		s1.concat("kumar");
		
		
		System.out.println(s1);
		
		StringBuffer s2 = new StringBuffer("Pritam");
		
		s2.append("kumar");
		
		System.out.println(s2);
		
		StringBuffer sb1 = s2.reverse();
		
		System.out.println(sb1);
		
		char c = s2.charAt(1);
		System.out.println(c);
		

		int index = s2.indexOf("a");
		System.out.println(index);
		
		
		s2.replace(2, 8, "jai");
		System.out.println(s2);
		
		
		StringBuffer sb2 = new StringBuffer("Testingisfun");
		String sb3 = sb2.substring(2);
		System.out.println(sb3);
		
		
		
		
		
	}

}
