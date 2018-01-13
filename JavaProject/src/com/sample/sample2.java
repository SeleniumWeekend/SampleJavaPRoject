package com.sample;

import java.util.Scanner;

public class sample2 {

	public static void main(String[] args) {
		
		int f1 = 0;
		int f2 = 1;
		for(int i=0;i<=9;i++)
		{
			int f3 =f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
		}
	
		
		

	}

}
