package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Task2 {
	public static void main(String[] args) throws IOException
	{
		int row=0;
		int cell=0;
		File location=new File("D:\\\\Demo2.xlsx");
		FileInputStream fin=new FileInputStream(location);
		Workbook w=new XSSFWorkbook(fin);
		Sheet s=w.getSheet("Students Information");
		for(int i=0;i<s.getPhysicalNumberOfRows();i++)
		{
			Row r=s.getRow(i);
			for(int j=0;j<r.getPhysicalNumberOfCells();j++)
			{
				org.apache.poi.ss.usermodel.Cell c=r.getCell(j);
				System.out.println(c);
			}
			
		}
		

}
}