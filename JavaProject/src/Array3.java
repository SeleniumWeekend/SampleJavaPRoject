
public class Array3 {

	public static void main(String[] args) 
	{

		int[][] a1 = new int[2][];
		
		System.out.println(a1.length);
		
		a1[0] = new int[3];
		a1[1] = new int[3];
		
		a1[0][0]= 10;
		a1[0][1]= 20;
		a1[0][2]= 30;
		
		a1[1][0]= 40;
		a1[1][1]= 60;
		a1[1][2]= 50;
		
		for(int i=0; i<a1.length; i++)
		{
			for(int j=0; j<a1.length+1; j++)
			{
				System.out.println(a1[i][j]);
			}
			
		}
		
		
	}

}
