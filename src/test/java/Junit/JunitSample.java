package Junit;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Tasks.Utilityclass;


public class JunitSample extends Utilityclass {
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Before Class");
		loadDriver();
		launchUrl("https://www.facebook.com");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("After Class");
		//quitBrowser();
	}
	
	@Before
	public void before()
	{
		System.out.println("Before");
		Date d=new Date();
		System.out.println(d);
	}
	
	@After
	public void after()
	{
		System.out.println("After");
		Date d=new Date();
		System.out.println(d);
	}
	
	@Test
	public void tc1()
	{
		System.out.println("Test1");
		WebElement txtEmail=driver.findElement(By.id("email"));
		insert(txtEmail,"forevernatarajan@gmail.com");
		WebElement txtPass=driver.findElement(By.id("pass"));
		insert(txtPass,"123456789");
		//WebElement btnLog=driver.findElement(By.id("login"));
		//click(btnLog);
		
	}
	
	public void tc6()
	{
		System.out.println("Test6");
	}
	
	public void tc3()
	{
		System.out.println("Test3");
	}



}
