package Tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task1 {
	public static void main(String[] args) throws IOException
	{
		
	
	File loc=new File("D:\\Demo.xlsx");
	FileInputStream str=new FileInputStream(loc);
	XSSFWorkbook w=new XSSFWorkbook(str);
	XSSFSheet s=w.getSheet("Sheet1");
	int rows=s.getPhysicalNumberOfRows();
	System.out.println(rows);
	
	Row r=s.getRow(2);
	int cell=r.getPhysicalNumberOfCells();
	System.out.println(cell);
	
	Cell c=r.getCell(1);
	int ct=c.getCellType();
	System.out.println(c);
	
	}


}
