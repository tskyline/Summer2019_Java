package day61_excel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelReadWrite
{
	/*
	  	Create custom class that can read and write an excel file
	  		instance variables:	String filepath;
	  							String sheetname;
	  							FileInputStream file;
	  							Workbook excelFile;
	  							Sheet sheet;
	  							
	  							Cell cell;
	  							
	  		actions: ReadData(int row,int cell)==>String
	  				 WriteData(int row,int cell, setValue)==>void
	 
	 */
	
		String filepath;
		String sheetname;
		FileInputStream file;
		Workbook excelFile;
		Sheet sheet;
		
		Cell cell;
		
		public excelReadWrite(String filepath,String sheetname)
		{
			this.filepath=filepath;
			this.sheetname=sheetname;
			try
			{
				file=new FileInputStream(filepath);	
				excelFile=WorkbookFactory.create(file);
				sheet=excelFile.getSheet(sheetname);
;			} catch (Exception e)
			{
				// TODO: handle exception
			}
				
		}
		
		
		public String readData(int rowNum, int cellNum)
		{
		    String data ="";  // store the cell data
            cell = sheet.getRow(rowNum).getCell(cellNum);
                data = cell.toString();
            return data;
		}
		
		 public void WriteData(int rowNum, int cellNum, String setValue) {
	            cell = sheet.getRow(rowNum).getCell(cellNum);
	            cell.setCellValue(setValue);
	            
	        }

		
	
}
