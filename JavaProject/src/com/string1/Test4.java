package com.string1;

public class Test4 
{
	public static void main(String[] args) 
	{

		String s1 = "de75velope877r";
		char c;
		
		for(int i = 0; i<s1.length(); i++)
		{
			c = s1.charAt(i);
			
			if(c>=47 && c<=56)
			{
				System.out.print(c);
			}
		}
		
	}

}
