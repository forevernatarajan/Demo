package Tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Scenario3 {
	public static void main(String[] args) throws IOException
	{
		
	
	File loc=new File("D:\\Demo.xlsx");
	FileInputStream str=new FileInputStream(loc);
	XSSFWorkbook w=new XSSFWorkbook(str);
	XSSFSheet s=w.getSheet("Sheet1");
	for(int i=2;i<s.getPhysicalNumberOfRows();i++)
	{
		Row r=s.getRow(i);
		for(int j=0;j<r.getPhysicalNumberOfCells();j++)
		{
		org.apache.poi.ss.usermodel.Cell c=r.getCell(j);
		
			int type=c.getCellType();
			if(type==1)
			{
				String val=c.getStringCellValue();
				System.out.println(val);
			}
			else if(type==0)
			{
				if(DateUtil.isCellDateFormatted(c))
				{
					java.util.Date cellVal=c.getDateCellValue();
					SimpleDateFormat fm=new SimpleDateFormat("mm/dd/yyyy");
					java.util.Date date=null;
					String value=fm.format(date);
					System.out.println(value);
					
					
					
				}
				else
				{
					double d=c.getNumericCellValue();
					long l=(long)d;
					String valOf=String.valueOf(l);
					System.out.println(valOf);
				}
			}
			
		}
	}
	
	

}

}
