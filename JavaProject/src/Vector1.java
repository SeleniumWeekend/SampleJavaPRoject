import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) 
	{
		Vector v = new Vector();
		
		System.out.println("Default Size : " +v.capacity());
		
		for(int i=1; i<=10; i++)
		{
			v.addElement(i);
		}
		System.out.println(" Size after adding 10 object : " +v.capacity());
		
		v.addElement("Java");
		
		System.out.println("Size after adding 11th object :"+v.capacity());
		
		
	}

}
