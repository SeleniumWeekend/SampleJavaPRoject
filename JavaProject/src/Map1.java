import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) 
	{

		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		
		hm.put(100, "Java");
		hm.put(101, "Python");
		hm.put(104, "Selenium");
		hm.put(103, "Perl");

		
		for(Map.Entry m : hm.entrySet())
		{
			System.out.println(m.getKey()+" ...... "+m.getValue());
			
		}
		
		
		
	}

}
