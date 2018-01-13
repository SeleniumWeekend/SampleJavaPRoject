package com.string1;

public class Test6 {

	public static void main(String[] args)
	{

		String s1 = "deveLOpeR";
		
		for(int i=0; i<s1.length(); i++)
		{
			int j = s1.charAt(i);
			
			if(j>=97 && j<=123)
			{
				j = j-32;
				char ch =(char)j;
				System.out.print(ch);
			}
			else if(j>=65 && j<=97)
			{
				j = j+32;
				char ch =(char)j;
				System.out.print(ch);
			}
			else
			{
				
			}
		}
		
		
		
		
	}

}
