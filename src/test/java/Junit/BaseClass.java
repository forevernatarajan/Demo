package Junit;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	public static WebDriver driver;
	public static Robot r;
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
	
	
	
	public static void insert(WebElement element, String value) throws AWTException
	{
		element.sendKeys(value);
		r=new Robot();
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
	
	
	public static void implicitWaits(int time)
	{
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
	}
	
	
	public static String logData(int row,int cell) throws IOException
	{
		String value=null;
		File location=new File("D:\\Demo2.xlsx");
		FileInputStream fin=new FileInputStream(location);
		Workbook w= new XSSFWorkbook(fin);
		Sheet s=w.getSheet("Login");
		Row r=s.getRow(row);
		Cell c=r.getCell(cell);
		int type=c.getCellType();
		if(type==1)
		{
			value=c.getStringCellValue();
		}
		else if(type==0)
		{
			if(DateUtil.isCellDateFormatted(c))
			{
				Date d=c.getDateCellValue();
				SimpleDateFormat sd=new SimpleDateFormat("dd/mm/yyyy");
				value=sd.format(d);
			}
			double d=c.getNumericCellValue();
			long l=(long) d;
			value=String.valueOf(l);
		}
		
		
		return value;
		
		
	}

}
