import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		
		al.add("abc");
		al.add("bcd");
		al.add("def");
		
		ArrayList al1 = new ArrayList();
		al1.add("bcd");
		al1.add("vdfa");
		
		System.out.println("After filter common value");
		al1.retainAll(al);
		
		for(int i=0; i<al1.size(); i++)
		{
			System.out.println(al1.get(i));
		}
		
		al1.addAll(al);
		
		System.out.println("Remove All");
		al1.removeAll(al);
		for(int i=0; i<al1.size(); i++)
		{
			System.out.println(al1.get(i));
		}
		
		
		
	}

}
