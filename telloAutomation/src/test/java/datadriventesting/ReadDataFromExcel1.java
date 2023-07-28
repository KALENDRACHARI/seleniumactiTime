package datadriventesting;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel1 {
public static void main(String[] args) throws Throwable{
	//Create the FileInputStream Obj of java with the absolute path of the address.
	FileInputStream fis=new FileInputStream("./srs/test/resource/testdata1.xlsx");
	//Call the create() from WorkBookFactory Class of POI Library
	Workbook workbook = WorkbookFactory.create(fis);
	//call the getSheet() by specifying the sheetName
	Sheet sheet = workbook.getSheet("mydata");
	//call the getRow() by specifying the row index value
	Row row = sheet.getRow(1);
	//call the getCell() by specifying the cell index
	Cell cell = row.getCell(2);
	//based on the type of data call the appropriate method
	 long numericValue =(long)cell.getNumericCellValue();
	System.out.println(numericValue);
	//String cellValue = cell.getStringCellValue();
	//System.out.println( cellValue);
	workbook.close();
}
}
