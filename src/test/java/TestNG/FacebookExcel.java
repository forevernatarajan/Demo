package TestNG;

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
import org.testng.annotations.DataProvider;

public class FacebookExcel {
	@DataProvider(name ="rep")
	private Object[][] data() throws IOException
	{
		return getData();
	}
	
	public static Object[][] getData() throws IOException
	{
		String value=null;
		File loc=new File("C:\\Users\\acer\\eclipse-workspace\\Natarajan\\Excel\\Demo.xlsx");
		FileInputStream fin=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(fin);
		Sheet s=w.getSheet("Sheet1");
		Row r=s.getRow(1);
		int rowCount=s.getPhysicalNumberOfRows();
		int cellCount=r.getPhysicalNumberOfCells();
		
		Object obj[][]=new Object[rowCount][cellCount];
		for(int i=0;i<rowCount;i++)
		{
			Row row=s.getRow(i);
			for(int j=0;j<cellCount;j++)
			{
				Cell c=row.getCell(j);
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
						SimpleDateFormat f=new SimpleDateFormat("dd/mm/yyyy");
						value=f.format(d);
						
					}
					else
					{
						double d=c.getNumericCellValue();
						long l=(long)d;
						value=String.valueOf(l);
						
					}
				}
				obj[i][j]=value;
			}
		}
		return obj;
		
		
		
	}
	

}
