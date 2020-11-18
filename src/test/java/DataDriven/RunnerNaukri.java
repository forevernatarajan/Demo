package DataDriven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RunnerNaukri extends BaseClass {
	public static void main(String[] args) throws IOException, AWTException
	{
		loadDriver();
		launchUrl("https://my.naukri.com/account/register/basicdetails");
		//implicitWaits(20);	
		
		
		driver.findElement(By.xpath("/html/body/div/form/div[1]/div/button")).click();
		WebElement name=driver.findElement(By.xpath("//input[@id='fname']"));
		insert(name,logData(1,0));
		
		WebElement mail=driver.findElement(By.xpath("//input[@id='email']"));
		insert(mail,logData(1,1));
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		insert(pass,logData(1,2));
		
		WebElement num=driver.findElement(By.xpath("//input[@name='number']"));
		insert(num,logData(1,3));
		
		WebElement city=driver.findElement(By.className("sugInp"));
		insert(city,logData(1,4));
				
	}

}
