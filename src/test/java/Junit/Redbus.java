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

public class Redbus extends Utilityclass {
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Before Class");
		loadDriver();
		launchUrl("https://www.redbus.in");
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
		
		driver.findElement(By.xpath("//*[@id=\"select_box_sign\"]")).click();
		
		driver.findElement(By.id("signInLink")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[8]/div[2]/div[2]")).click();
		
		driver.switchTo().window("https://www.facebook.com/login.php?skip_api_login=1&api_key=377581119008028&kid_directed_site=0&app_id=377581119008028&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fdialog%2Foauth%3Fapp_id%3D377581119008028%26cbt%3D1603157121867%26channel_url%3Dhttps%253A%252F%252Fstaticxx.facebook.com%252Fx%252Fconnect%252Fxd_arbiter%252F%253Fversion%253D46%2523cb%253Df2b821d2d0b2128%2526domain%253Dwww.redbus.in%2526origin%253Dhttps%25253A%25252F%25252Fwww.redbus.in%25252Ff15548c2bf0776c%2526relation%253Dopener%26client_id%3D377581119008028%26display%3Dpopup%26domain%3Dwww.redbus.in%26e2e%3D%257B%257D%26fallback_redirect_uri%3Dhttps%253A%252F%252Fwww.redbus.in%252Flogin%253FofferType%253DPaymentOffers%2526defaultSlide%253Dhome%2526isOnlyMobile%253Dfalse%26locale%3Den_US%26logger_id%3Df424cc2d9888bc%26origin%3D1%26redirect_uri%3Dhttps%253A%252F%252Fstaticxx.facebook.com%252Fx%252Fconnect%252Fxd_arbiter%252F%253Fversion%253D46%2523cb%253Df38370e4962788%2526domain%253Dwww.redbus.in%2526origin%253Dhttps%25253A%25252F%25252Fwww.redbus.in%25252Ff15548c2bf0776c%2526relation%253Dopener%2526frame%253Df18a2f066d8e79c%26response_type%3Dtoken%252Csigned_request%252Cgraph_domain%26scope%3Demail%26sdk%3Djoey%26ret%3Dlogin%26fbapp_pres%3D0&cancel_url=https%3A%2F%2Fstaticxx.facebook.com%2Fx%2Fconnect%2Fxd_arbiter%2F%3Fversion%3D46%23cb%3Df38370e4962788%26domain%3Dwww.redbus.in%26origin%3Dhttps%253A%252F%252Fwww.redbus.in%252Ff15548c2bf0776c%26relation%3Dopener%26frame%3Df18a2f066d8e79c%26error%3Daccess_denied%26error_code%3D200%26error_description%3DPermissions%2Berror%26error_reason%3Duser_denied&display=popup&locale=en_GB&pl_dbl=0");
		
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
