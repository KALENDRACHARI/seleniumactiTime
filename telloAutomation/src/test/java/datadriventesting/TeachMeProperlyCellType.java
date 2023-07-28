package datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TeachMeProperlyCellType {
public static void main(String[] args) throws Throwable{
	FileInputStream fis = new FileInputStream("./srs/test/resource/dropdowndaymonthyear.xlsx");
	Workbook workBook = WorkbookFactory.create(fis);
	Sheet sheet = workBook.getSheet("mydata");
	CellType returnmeSomething = sheet.getRow(2).getCell(30).getCellType();
	System.out.println(returnmeSomething);
	//returnmeSomething.equals("STRING")
	if (String.valueOf(returnmeSomething).equals("STRING")) {
		System.out.println("boolean True");
		//returnmeSomething.equals("NUMERIC")
	}else if (String.valueOf(returnmeSomething).equals("NUMERIC")) {
		System.out.println("Boolean False");
	} 
	workBook.close();
}
}

