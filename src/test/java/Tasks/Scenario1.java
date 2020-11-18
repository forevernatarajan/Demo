package Tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Scenario1 {
	public static void main(String[] args) throws IOException
	{
		
	
	File loc=new File("D:\\Demo.xlsx");
	FileInputStream str=new FileInputStream(loc);
	Workbook w=new XSSFWorkbook(str);
	Sheet s=w.getSheet("Sheet1");
	
	for(int i=0;i<s.getPhysicalNumberOfRows();i++)
	{
		Row r=s.getRow(i);
		for(int j=0;j<r.getPhysicalNumberOfCells();j++)
		{
			Cell c=(Cell) r.getCell(j);
			System.out.println(c+ "");
			
		}
		System.out.println("");
		
	}
	}

}
