package Tasks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws IOException
	{
		File loc=new File("C:\\Users\\acer\\eclipse-workspace\\Natarajan\\Excel\\Demo2.xlsx");
		
		FileOutputStream out=new FileOutputStream(loc);
		
		Workbook w=new XSSFWorkbook();
		
		Sheet s=w.createSheet();
		
		Row r=s.createRow(1);
		
		Cell c=r.createCell(2);
		
		c.setCellValue("Selenium");
		
		w.write(out);
		
		System.out.println("Done...");

}
}