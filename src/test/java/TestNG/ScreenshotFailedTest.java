package TestNG;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class ScreenshotFailedTest extends BaseClass {
	
	@BeforeMethod
	private void beforeMethod()
	{
		loadDriver();
		launchUrl("https://www.amazon.in");
	}

	@Test
	private void test1()
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Fossil Watches");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		Assert.assertTrue(false);
		
	}

}
