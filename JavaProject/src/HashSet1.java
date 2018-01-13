import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSet1 {

	public static void main(String[] args) 
	{
		
		SortedSet ss = new TreeSet();
			
		ss.add("Java");
		ss.add("Python");
		ss.add("Selenium");
		ss.add("Java");
		ss.add("C");
		
		System.out.println(ss.first()); // C
		System.out.println(ss.last()); // Selenium
		SortedSet ss1 = ss.headSet("Selenium");
		
		System.out.println(ss1); //  [C, Java, Python]
		
		SortedSet ss2 = ss.tailSet("Python");
		
		System.out.println(ss2); // [Python, Selenium]
		
		SortedSet ss3 = ss.subSet("Java", "Selenium");
		System.out.println(ss3); // [Java, Python]
		
		
		System.out.println(ss);	// [C, Java, Python, Selenium]
		
			
		
	}
}
