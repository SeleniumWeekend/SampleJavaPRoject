interface WebDriver
{
	void m1();
}

public class Run1 implements WebDriver
{
	Run1()
	{
		System.out.println("Hi");
	}
	public void m1()
	{
		System.out.println("m1");
	}
	
	public static void main(String[] args) {

		WebDriver[] driver = new WebDriver[3];
		
		System.out.println(driver.length);
		
		driver[0] = new  Run1();
		driver[1] = new  Run1();
		driver[2] = new  Run1();
		
		for(int i=0; i<driver.length; i++)
		{
			System.out.println(driver[i]);
		}
		
		
	}

}
