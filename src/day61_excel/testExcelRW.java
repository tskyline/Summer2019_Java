package day61_excel;

public class testExcelRW
{
	public static void main(String[] args)
	{
		String path ="/Users/TK/Desktop/CyberTek/TestData.xlsx";
        String sheetName = "Sh";
        
        excelReadWrite obj = new excelReadWrite(path, sheetName);
        
       String data1 = obj.readData(2, 0);
       System.out.println(data1);
        
        obj.WriteData(2, 0, "Mehmet");
        
        String data2 =  obj.readData(2, 0);
        System.out.println( data2 );  //
        	
	}
}
