
class Student
{
	String name;
	
	Student(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return name;
	}
}


public class Run {

	public static void main(String[] args) 
	{

		Student[] s1 = new Student[4];
		s1[0] = new Student("ABD");
		
		s1[1] = new Student("SBD");
		
		s1[2] = new Student("DBD");
		s1[3] = new Student("FBD");
		
		for(int i=0 ; i<s1.length; i++)
		{
			System.out.println(s1[i]);
		}
		
	}

}
