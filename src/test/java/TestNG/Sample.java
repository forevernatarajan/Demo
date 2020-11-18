package TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample {
	
	
	
	
	
	
	@Parameters("browserName")
	@Test
	private void test2(String browser)
	{
		System.out.println("Sample Test");
		WebDriver driver = null;
		
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		
		else if(browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\Drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else if(browser.equals("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		else
		{
			System.out.println("Invalid Name");
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtEmail=driver.findElement(By.id("email"));
		txtEmail.sendKeys("forevernatarajan@gmail.com");
		
		WebElement txtPass=driver.findElement(By.id("pass"));
		txtPass.sendKeys("THATSMYSECRET1988");
		
		driver.findElement(By.name("login")).click();
		
		
		
	}

}
