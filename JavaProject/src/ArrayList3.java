import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList3 {

	public static void main(String[] args)
	{

		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("Python");
		al.add("Selenium");
		
		
		// Using for each loop
		System.out.println();
		System.out.println("Using for each loop");
		for(String s : al)
		{
			System.out.println(s);
		}
		
		// Using for each loop
		System.out.println();
		System.out.println("Using Iterator ");
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
