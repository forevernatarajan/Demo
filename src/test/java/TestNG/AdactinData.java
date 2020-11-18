package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdactinData {
	@DataProvider(name="rep")
	public Object[][] data()
	{
		return new Object[][] {{"forevernatarajan1988", "THATSMYSECRET1988", "Melbourne", "Hotel Creek", "Deluxe", "10 - Ten", "02/11/2020", "03/11/2020", "1- One", "0- None"}};
		
	}
	
	@Test(dataProvider="rep")
	
		private void test1(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10)
		{
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			System.out.println(s5);
			System.out.println(s6);
			System.out.println(s7);
			System.out.println(s8);
			System.out.println(s9);
			System.out.println(s10);
			
		}
	


}
