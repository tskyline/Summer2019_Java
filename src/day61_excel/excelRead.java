package day61_excel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelRead
{
	public static void main(String[] args) throws Exception
	{
		String filePath="/Users/TK/Desktop/CyberTek/TestData.xlsx";
		String name="Sh";
		FileInputStream file=new FileInputStream(filePath); // read a file
		
		Workbook excelFile=WorkbookFactory.create(file);
		
		Sheet sheet=excelFile.getSheet(name);
		
		Cell cell=sheet.getRow(2).getCell(0);
		
		String cellData=cell.getStringCellValue();//converts data to string
		System.out.println(cellData);
		
		cell.setCellValue("Tuna Skyline");//write new value to excel
		
		System.out.println(cell);
		
		
	}
}
