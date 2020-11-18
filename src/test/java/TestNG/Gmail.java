package TestNG;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Gmail extends BaseClass {
	@BeforeClass
	private void bfClass()
	{
		System.out.println("Before Class");
		loadDriver();
		loadDriver();
		launchUrl(" https://mail.google.com/");
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
		WebElement txtEmail=driver.findElement(By.id("identifierId"));
		insert(txtEmail,"forevernatarajan@gmail.com");
		WebElement log=driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]"));
		log.click();
		
		WebElement txtPass=driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
		insert(txtPass,"THATSMYSECRET1988");
		
		
		
		
	}
	
	@Test(priority=-1)
	private void test2()
	{
		System.out.println("Sample Test");
	}


}
