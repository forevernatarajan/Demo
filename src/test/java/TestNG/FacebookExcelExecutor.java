package TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FacebookExcelExecutor extends BaseClass {
	@Test(dataProvider="rep", dataProviderClass=FacebookExcel.class)
	private void test(String s1, String s2)
	{
		loadDriver();
		//loadDriver();
		launchUrl("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(s1);
		driver.findElement(By.id("pass")).sendKeys(s2);
		driver.findElement(By.id("u_0_b")).click();
		
	}
	

}
