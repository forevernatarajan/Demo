package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Task1 {
	public static void main(String[] args) throws IOException
	{
		int row=0;
		int cell=0;
		File location=new File("D:\\\\Demo2.xlsx");
		FileInputStream fin=new FileInputStream(location);
		Workbook w=new XSSFWorkbook(fin);
		Sheet s=w.getSheet("Students Information");
		int rCount=s.getPhysicalNumberOfRows();
		Row r=s.getRow(row);
		org.apache.poi.ss.usermodel.Cell c=r.getCell(cell);
		int cellCoun=r.getPhysicalNumberOfCells();
		System.out.println(rCount);
		System.out.println(cellCoun);
		
	}

}
