
public class ForEachLoop {

	public static void main(String[] args) {

		String[] s1 = {"A", "B","C", "D"};
		
		
		for(int i=0; i<s1.length; i++)
		{
			System.out.println(s1[i]);
		}
		
		System.out.println("Using For Each loop...");
		
		for(String s : s1)
		{
			System.out.println(s);
		}
		
	}

}
