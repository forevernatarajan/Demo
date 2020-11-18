package Tasks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Scenario4 {
	public static void main(String[] args) throws IOException
	{
		
	
	File loc=new File("D:\\Demo1.xlsx");
	Workbook w=new XSSFWorkbook();
	Sheet s=w.createSheet("input");
	Row r=s.createRow(0);
	org.apache.poi.ss.usermodel.Cell c=r.createCell(0);
	c.setCellValue("Java");
	FileOutputStream fout=new FileOutputStream(loc);
	w.write(fout);
	
	
	
	
	
	

}
}