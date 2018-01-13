package com.string1;

public class Test5 {

	public static void main(String[] args) {

		String s1 = "madam";
		
		String s2 = "";
		
		for(int i =s1.length()-1; i>=0; i--)
		{
			char c = s1.charAt(i);
			
			s2 = s2+c;
		}
		
		System.out.println(s2);
		if(s1.equals(s2))
		{
			System.out.println("Given String is pelindrome");
		}
		else
		{
			System.out.println("Given String is not pelindrome");
		}
		
	}

}
