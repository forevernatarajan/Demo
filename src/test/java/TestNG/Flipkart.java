package TestNG;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart extends BaseClass {
	
		@BeforeClass
		private void bfClass()
		{
			System.out.println("Before Class");
			loadDriver();
			loadDriver();
			launchUrl("https://www.flipkart.com/account/login");
		}
		
		@AfterClass
		private void afClass()
		{
			System.out.println("After Class");
		}
		
		@BeforeMethod
		private void bMethod()
		{
			System.out.println("Before Method");
		}
		
		@AfterMethod
		private void aMethod()
		{
			System.out.println("After Method");
		}
		
		@Test(priority=0)
		private void test1() throws AWTException
		{
			System.out.println("Sample Test1");
			WebElement txtEmail=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input"));
			insert(txtEmail,"forevernatarajan@gmail.com");
			WebElement txtPass=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[2]/input"));
			insert(txtPass,"THATSMYSECRET1988");
			WebElement log=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[3]/button"));
			log.click();
			
			
		}
		
		@Test(priority=-1)
		private void test2()
		{
			System.out.println("Sample Test");
		}

		
	}
