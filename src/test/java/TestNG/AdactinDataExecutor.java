package TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AdactinDataExecutor extends BaseClass {
	@Test(dataProvider="rep", dataProviderClass=AdactinDataProvider.class)
	private void test2(String s1, String s2)
	{
		loadDriver();
		launchUrl("http://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys(s1);
		driver.findElement(By.id("password")).sendKeys(s2);
		driver.findElement(By.id("login")).click();
		
	}

}
