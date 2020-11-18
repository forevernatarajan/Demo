package Tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRd {
	public static void main(String[] args) throws IOException
	{
		File loc=new File("D:\\Demo.xlsx");
		
		FileInputStream str=new FileInputStream(loc);
		
		Workbook w=new XSSFWorkbook(str);
		
		Sheet s=w.getSheet("Sheet1");
		
		//Row r=s.getRow(1);
		for(int i=0;i<s.getPhysicalNumberOfRows();i++)
		{
			Row r=s.getRow(i);
			for(int j=0;j<r.getPhysicalNumberOfCells();j++)
			{
				Cell c=r.getCell(j);
				
				int type=c.getCellType();
				
				//System.out.println(c);
				
				if(type==1)
				{
					String value=c.getStringCellValue();
					System.out.println(value);
				}
				
				else if(type==0)
				{
					if(DateUtil.isCellDateFormatted(c))
					{
						Date date=c.getDateCellValue();
						SimpleDateFormat sim=new SimpleDateFormat("dd/mm/yyyy");
						String value=sim.format(date);
						System.out.println(value);
						
					}
					else
					{
						double n=c.getNumericCellValue();
						long l=(long)n;
						String value=String.valueOf(l);
						System.out.println(value);
					}
				}
		}
			}
		}
		
		
}