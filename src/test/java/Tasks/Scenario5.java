package Tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Scenario5 {
	public static void main(String[] args) throws IOException
	{
		
	
	File loc=new File("D:\\Demo1.xlsx");
	FileInputStream fin=new FileInputStream(loc);
	Workbook w=new XSSFWorkbook(fin);
	Sheet s=w.getSheet("input");
	Row r=s.getRow(0);
	org.apache.poi.ss.usermodel.Cell c=r.getCell(0);
	c.setCellValue("Selenium");
	String s1=c.getStringCellValue();
	if(s1.contains("Java"))
	{
		c.setCellValue("Selenium");
	}
	
	FileOutputStream fout=new FileOutputStream(loc);
	w.write(fout);
	
	
	
	
	
	

}

}
