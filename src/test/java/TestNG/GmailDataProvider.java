package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GmailDataProvider {
	@DataProvider(name="rep")
	public Object[][] data()
	{
		return new Object[][] {{"forevernatarajan", "THATSMYSECRET"}};
		
	}
	
	@Test(dataProvider="rep")
	
		private void test1(String s1, String s2)
		{
			System.out.println(s1);
			System.out.println(s2);
		}
	

}
