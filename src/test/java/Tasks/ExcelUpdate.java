package Tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {
	public static void main(String[] args) throws IOException
	{
		File loc=new File("C:\\Users\\acer\\eclipse-workspace\\Natarajan\\Excel\\Demo2.xlsx");
		
		//FileOutputStream out=new FileOutputStream(loc);
		
		FileInputStream in=new FileInputStream(loc);
		
		Workbook w=new XSSFWorkbook(in);
		
		Sheet s=w.getSheet("Sheet0");
		
		Row r=s.getRow(1);
		
		Cell c=r.getCell(2);
		
		String value=c.getStringCellValue();
		
		if(value.equals("Selenium"))
		{
			c.setCellValue("Java");
		}
		FileOutputStream out=new FileOutputStream(loc);
		
		w.write(out);
		
		System.out.println("Updated");
}
}