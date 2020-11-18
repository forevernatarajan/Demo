package Tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException
	{
	File loc=new File("D:\\Demo.xlsx");
	
	FileInputStream str=new FileInputStream(loc);
	
	Workbook w=new XSSFWorkbook(str);
	
	Sheet s=w.getSheet("Sheet1");
	
	Row r=s.getRow(2);
	
	/*// to get the number of available rows in the sheet
	 * 
	int count=s.getPhysicalNumberOfRows();
	
	int cellCount=r.getPhysicalNumberOfCells();
	
	System.out.println(count);
	
	System.out.println(cellCount);
	
	Cell c=r.getCell(0);
	
	System.out.println(c);*/
	
	// iterate all rows
	for(int i=0;i<s.getPhysicalNumberOfRows();i++)
	{
		Row r1=s.getRow(i);
		for(int j=0;j<r.getPhysicalNumberOfCells();j++)
		{
			
			Cell c=r1.getCell(j);
			System.out.println(c);
		}
		
	}
	System.out.print("");
	
	

}
}