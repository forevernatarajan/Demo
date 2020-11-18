package TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AdactinNew extends BaseClass {
	@Test(dataProvider="rep", dataProviderClass=AdactinData.class)
	private void test2(String s1, String s2, String s3, String s4, String s5, String s6)
	{
		loadDriver();
		launchUrl("http://adactinhotelapp.com/");
		driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[7]/td/a")).click();
		driver.findElement(By.id("username")).sendKeys(s1);
		driver.findElement(By.id("password")).sendKeys(s2);
		driver.findElement(By.id("re_password")).sendKeys(s3);
		driver.findElement(By.id("full_name")).sendKeys(s4);
		driver.findElement(By.id("email_add")).sendKeys(s5);
		driver.findElement(By.id("captcha_form")).sendKeys(s6);
		driver.findElement(By.id("tnc_box")).click();
		driver.findElement(By.id("Submit")).click();
		
		
		
		
		
		
	}


}
