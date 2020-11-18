package Tasks;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Runner extends Utilityclass  {
public static void main(String args[])throws IOException, InterruptedException
{
	loadDriver();
	launchUrl("https://www.facebook.com");
	maxWindow();
	System.out.println(getUrl());
	System.out.println(pageTitle());
	
	WebElement txtUser=driver.findElement(By.id("email"));
	insert(txtUser,"forevernatarajan@gmail.com");
	
	WebElement txtPass=driver.findElement(By.id("pass"));
	insert(txtPass,"THATSMYSECRET1988");
	
	WebElement btnLogin=driver.findElement(By.name("login"));
	click(btnLogin);
	
	
	//closeBrowser();
	//quitBrowser();
	
	
	/*
	
	
	WebDriver driver=loadDriver();
	launchUrl("https://www.facebook.com");
	
	
	LoginPage lp=new LoginPage();
	fill(lp.getTxtUser(),"Java");
	fill(lp.getTxtPass(),"JavaPass");
	driver.quit();
	*/
}
}
