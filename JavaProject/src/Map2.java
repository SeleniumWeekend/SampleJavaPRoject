import java.util.HashMap;
import java.util.Map;


class Employee1
{
	String name;
	int id;
	
	Employee1(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public String toString()
	{
		return name+" , "+id;
	}
	
}

public class Map2 {

	public static void main(String[] args) {

		HashMap<Integer, Employee1> hm = new HashMap<Integer, Employee1>();
		
		hm.put(101, new Employee1("pritam", 103));
		hm.put(102, new Employee1("pooja", 104));
		hm.put(103, new Employee1("prity", 105));
		
		for(Map.Entry m : hm.entrySet())
		{
			System.out.println(m.getKey()+"  ....... "+m.getValue());
		}
		
		
		
	}

}
