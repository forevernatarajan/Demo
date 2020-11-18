package TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GmailDataExecutor extends BaseClass{
	@Test(dataProvider="rep", dataProviderClass=GmailDataProvider.class)
	private void test2(String s1, String s2)
	{
		loadDriver();
		launchUrl("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(s1);
		driver.findElement(By.id("pass")).sendKeys(s2);
		
	}
	

}
