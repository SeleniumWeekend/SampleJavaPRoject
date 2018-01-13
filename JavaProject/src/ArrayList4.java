import java.util.ArrayList;
import java.util.Iterator;

class Employee
{
	String name;
	int id;
	String add;
	
	Employee(String name, int id, String add)
	{
		this.name = name;
		this.id = id;
		this.add = add;
	}
	
	public String toString()
	{
		return name+" "+id+" "+add;
	}
	
}



public class ArrayList4 {

	public static void main(String[] args)
	{
		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee e1 = new Employee("Pritam", 103, "Belgaum");
		Employee e2 = new Employee("pooja", 104, "Bangalore");
		Employee e3 = new Employee("prity", 105, "saharsa");
		Employee e4 = new Employee("anand", 106, "AP");
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		Iterator<Employee> itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
