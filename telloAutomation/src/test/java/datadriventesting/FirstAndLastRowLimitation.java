package datadriventesting;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FirstAndLastRowLimitation {
public static void main(String[] args) throws Throwable {
	FileInputStream fis  =new FileInputStream("./srs/test/resource/dropdowndaymonthyear.xlsx");
	Workbook workBook = WorkbookFactory.create(fis);
	Sheet sheet = workBook.getSheet("mydata");
	int firstRowIndex = sheet.getFirstRowNum();
	System.out.println(firstRowIndex);
	int lastRowIndex = sheet.getLastRowNum();
	System.out.println(lastRowIndex);
	workBook.close();
}
}
