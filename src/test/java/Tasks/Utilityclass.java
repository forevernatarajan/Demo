package Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Utilityclass {
	public static WebDriver driver;
	public static WebDriver loadDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	
	public static void launchUrl(String url)
	{
		driver.get(url);
	}
	
	public static String getUrl()
	{
		String url=driver.getCurrentUrl();
		return url;
		
	}
	
	
	
	public static void insert(WebElement element, String value)
	{
		element.sendKeys(value);
	}
	
	
	public static void click(WebElement e)
	{
		e.click();
		
	}
	
	public static void maxWindow()
	{
		driver.manage().window().maximize();
	}
	
	private static void clickButton(WebElement element)
	{
		element.click();
	}
	
	public static void dragDrop(WebElement src, WebElement dest)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();
		
	}
	
	public static String pageTitle()
	{
		String x=driver.getTitle();
		return x;
	}
	
	
	public static void closeBrowser()
	{
		driver.close();
	}
	
	public static void quitBrowser()
	{
		driver.quit();
	}
	
	public static void pageUrl()
	{
		String x=driver.getTitle();
		System.out.println(x);
	}
	
	public static
	void moveToElement(WebElement e)
	{
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
	}
}

