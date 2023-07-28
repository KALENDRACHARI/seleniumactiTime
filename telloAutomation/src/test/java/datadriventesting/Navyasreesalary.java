package datadriventesting;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Navyasreesalary {
	public static void main(String[] args) throws Throwable {
		List<String> expectedslnoList = new ArrayList<String>();
		List<String> expectednameList = new ArrayList<String>();
		List<String> expectedsalaryList = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("./srs/test/resource/navya.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("ACHARI");
		int firstRowIndex = sheet.getFirstRowNum();
		int lastRowIndex = sheet.getLastRowNum();
		System.out.print(firstRowIndex);
		System.out.print(" "+lastRowIndex);
		String.valueOf(0);
		/*for (int i = firstRowIndex; i <= lastRowIndex; i++) {
			int firstCellIndex = (int) sheet.getRow(i).getFirstCellNum();
			int lastcellIndex = (int) sheet.getRow(i).getLastCellNum();
			System.out.println(lastcellIndex);
			for (int j = firstCellIndex; j < lastcellIndex; j++) {
				CellType cellType = sheet.getRow(i).getCell(j).getCellType();
				if (String.valueOf(cellType).equals("STRING")) {
					// System.out.println(sheet.getRow(i).getCell(j).getCellType());
					expectedslnoList.add(sheet.getRow(i).getCell(j).getStringCellValue());
				} else if (String.valueOf(cellType).equals("NUMERIC")) {
					System.out.println(sheet.getRow(i).getCell(j).getNumericCellValue());
				long cellValue = (long)sheet.getRow(i).getCell(j).getNumericCellValue();
				System.out.println(cellValue);
					if (lastcellIndex == 12) {
						expectednameList.add(String.valueOf((long) sheet.getRow(i).getCell(j).getNumericCellValue()));
					} else if (lastcellIndex == 3) {
						expectedsalaryList.add(String.valueOf((long) sheet.getRow(i).getCell(j).getNumericCellValue()));
					}
				}*/
				workbook.close();
				//System.out.println(expectedslnoList);
				//System.out.println(expectednameList);
				//System.out.println(expectedsalaryList);
	}
}