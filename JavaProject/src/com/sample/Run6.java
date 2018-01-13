package com.sample;

class Student2
{
	String name;
	int id;
	Student2(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public boolean equals(Object o1)
	{
		String name1 = this.name;
		int id1 = this.id;
		
		Student2 s2 = (Student2)o1;
		
		String name2 = s2.name;
		int id2 = s2.id;
		
		if(name1.equals(name2) && id1==id2)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
		
	}
	
}

public class Run6 {

	public static void main(String[] args) {

		Student2 s1 = new Student2("JAVA", 500);
		Student2 s2 = new Student2("JAVA", 500);
		Student2 s3 = s1;
		
		boolean flag = s1.equals(s2);
		System.out.println(flag);
		System.out.println(s1.equals(s3));
		
	}

}
