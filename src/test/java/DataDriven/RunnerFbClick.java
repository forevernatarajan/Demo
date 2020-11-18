package DataDriven;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RunnerFbClick extends BaseClass{
	public static void main(String[] args) throws IOException, AWTException
	{
		loadDriver();
		launchUrl("https://www.facebook.com/");
		WebElement usr=driver.findElement(By.id("email"));
		insert(usr,logData(1,0));
		
		WebElement pass=driver.findElement(By.id("pass"));
		insert(pass,logData(1,1));
		
		WebElement log=driver.findElement(By.xpath("//button[@type='submit']"));
		log.click();
		
	}


}
