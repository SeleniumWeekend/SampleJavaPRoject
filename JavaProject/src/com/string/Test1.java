package com.string;

public class Test1 {

	public static void main(String[] args)
	{

		String s1 = "developer";
		
		if(s1.equalsIgnoreCase("DeVEloper"))
		{
			System.out.println("PASS");
		}
		
		char[] ch = s1.toCharArray();
		
		for(int i=0; i<ch.length; i++)
		{
			System.out.println(ch[i]);
		}
		
		int index = s1.lastIndexOf("per");
		
		System.out.println(index);
		
		int index1 = s1.lastIndexOf('e');
		
		System.out.println(index1);
		
		int j = s1.indexOf('e');
		
		System.out.println(j);
	
		String s2 = "  testing ";
		
		System.out.println(s2);
		
		s2 = s2.trim();
		
		String s5 = "testing";
		
		System.out.println(s2.equals(s5));
		
		
		System.out.println(s2);
		
		String s3 = "my name is khan";
		
		String s4 = s3.replace('h', 'a');
		
		System.out.println(s4);
		
		s3 = s3.replace("khan", "pritam");
		
		System.out.println(s3);
		
		
		
		
	}

}
