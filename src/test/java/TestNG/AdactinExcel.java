package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AdactinExcel extends BaseClass {
	@Test(dataProvider="rep", dataProviderClass=AdactinData.class)
	private void test2(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10)
	{
		loadDriver();
		launchUrl("http://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys(s1);
		driver.findElement(By.id("password")).sendKeys(s2);
		driver.findElement(By.id("login")).click();
		
		WebElement txtLoc=driver.findElement(By.id("location"));
		Select sc=new Select(txtLoc);
		sc.selectByVisibleText(s3);
		
		WebElement txtLoc1=driver.findElement(By.id("hotels"));
		Select sc1=new Select(txtLoc1);
		sc1.selectByVisibleText(s4);
		
		WebElement txtLoc2=driver.findElement(By.id("room_type"));
		Select sc2=new Select(txtLoc2);
		sc2.selectByVisibleText(s5);
		
		WebElement txtLoc3=driver.findElement(By.id("room_nos"));
		Select sc3=new Select(txtLoc3);
		sc3.selectByVisibleText(s6);
		
		WebElement txtLoc4=driver.findElement(By.id("datepick_in"));
		Select sc4=new Select(txtLoc4);
		sc4.selectByVisibleText(s7);
		
		WebElement txtLoc5=driver.findElement(By.id("datepick_out"));
		Select sc5=new Select(txtLoc5);
		sc5.selectByVisibleText(s8);
		
		WebElement txtLoc6=driver.findElement(By.id("adult_room"));
		Select sc6=new Select(txtLoc6);
		sc6.selectByVisibleText(s9);
		
		WebElement txtLoc7=driver.findElement(By.id("child_room"));
		Select sc7=new Select(txtLoc7);
		sc7.selectByVisibleText(s10);
		
		driver.findElement(By.id("Submit")).click();
		
		

			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	

}
