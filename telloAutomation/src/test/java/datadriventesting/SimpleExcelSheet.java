package datadriventesting;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SimpleExcelSheet {
public static void main(String[] args) throws Throwable{
	//Create the FileInputStream Obj of java with the absolute path of the address.
	FileInputStream fis=new FileInputStream("./srs/test/resource/slnoname.xlsx");
	//Call the create() from WorkBookFactory Class of POI Library
	Workbook workbook = WorkbookFactory.create(fis);
	//call the getSheet() by specifying the sheetName
	Sheet sheet = workbook.getSheet("mydata1");
	//call the getRow() by specifying the row index value
	Row row = sheet.getRow(0);
	short firstrow= row.getFirstCellNum();
	short lastrow = row.getLastCellNum();
   // for (int i =firstrow;i<lastrow;i++) {
    	//System.out.println(lastrow);
    	//Cell cellValue = row.getCell(firstrow);
    	System.out.println( firstrow);
		
	}
		
	
	
	
//	workbook.close();
}
