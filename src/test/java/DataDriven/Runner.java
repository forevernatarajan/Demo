package DataDriven;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Runner extends BaseClass {
public static void main(String[] args) throws IOException, AWTException
{
	loadDriver();
	launchUrl("http://www.adactin.com/HotelApp/");
	WebElement usr=driver.findElement(By.xpath("//input[@id='username']"));
	insert(usr,logData(1,0));
	
	WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
	insert(pass,logData(1,1));
	
}
}
