import java.util.Iterator;
import java.util.TreeSet;

public class Treeset2 {

	public static void main(String[] args)
	{

		TreeSet ts = new TreeSet();
		
		
		ts.add("Java");
		ts.add("Python");
		ts.add("Selenium");
		ts.add("Java");
		ts.add("C");
		//ts.add(100); // ClassCastException
		ts.add(null); // NullPointerException
		
		Iterator itr = ts.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
