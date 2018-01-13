package com.sample;

import java.util.Scanner;

public class gretest {

	public static void main(String[] args) {

		System.out.println("Enter the nos to check which it is largest");
		Scanner scan= new Scanner(System.in);
		int n1= scan.nextInt();
		int n2= scan.nextInt();
		int n3= scan.nextInt();
		if((n1>n2)&& (n1>n3))
		{
			System.out.println(n1+"is greater");
		}
		else if((n2>n1)&&(n2>n3))
		{
			System.out.println(n2+"is greater");	
		}
		else
			System.out.println(n3+"is greater");
		
	}

}
