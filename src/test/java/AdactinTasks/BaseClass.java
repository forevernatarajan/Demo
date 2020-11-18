package AdactinTasks;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
	public static Actions a;

	public WebDriver LaunchBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vijay\\eclipse-workspace\\Seleniumday1\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		return driver;
	}

	public void BrowserMax() {
		driver.manage().window().maximize();

	}

	public void EnterURL(String url) {

		driver.get(url);
	}

	public void FetchTitle() {

		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void Fill(WebElement element, String text) {

		element.sendKeys(text);
	}

	public static void btnClick(WebElement element) {
		element.click();

	}

	public void rightClick(WebElement element) {
		a.contextClick(element).perform();
		
	}
	public void btnDoubleClick(WebElement element) {
	
		a.doubleClick(element).perform();
	}
	public static String readExcel(int rowNo, int cellNo) throws IOException {
			
			File file = new File ("C:\\Users\\Vijay\\Documents\\Selenium\\Hotel Details.xlsx");
			
			FileInputStream fileStream = new FileInputStream(file);
			Workbook W = new XSSFWorkbook(fileStream);
			Sheet s = W.getSheet("Hotel");
			
				
			Row row = s.getRow(rowNo);
				
			Cell c = row.getCell(cellNo);
			int cellType = c.getCellType();
			
			String value = "";
			
			if (cellType==1) {
				
				value = c.getStringCellValue();
				
			}
			else if (DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
				value = sim.format(d);
			}
					
			else {
				
				double numericCellValue = c.getNumericCellValue();
				long l = (long)numericCellValue;
				value= String.valueOf(l);
			}
			
					
			
		return value;		
			
		}



	}


