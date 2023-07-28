package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.util.ArrayList;
import java.util.List;

public class ReaddatafromExcaldaymonthyear {
	public static void main(String[] args) throws Throwable {
		List<String> expectedDayList = new ArrayList<String>();
		List<String> expectedMonthList = new ArrayList<String>();
		List<String> expectedYearList = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("./srs/test/resource/dropdowndaymonthyear.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("mydata");
		int firstRowIndex = sheet.getFirstRowNum();
		int lastRowIndex = sheet.getLastRowNum();
		for (int i = firstRowIndex; i <= lastRowIndex; i++) {
			int firstCellIndex = (int) sheet.getRow(i).getFirstCellNum();
			int lastcellIndex = (int) sheet.getRow(i).getLastCellNum();
			System.out.println(lastcellIndex);
			for (int j = firstCellIndex + 1; j < lastcellIndex; j++) {
				CellType cellType = sheet.getRow(i).getCell(j).getCellType();
				if (String.valueOf(cellType).equals("STRING")) {
					// System.out.println(sheet.getRow(i).getCell(j).getCellType());
					expectedMonthList.add(sheet.getRow(i).getCell(j).getStringCellValue());
				} else if (String.valueOf(cellType).equals("NUMERIC")) {
//					System.out.println(sheet.getRow(i).getCell(j).getNumericCellValue());
//					long cellValue = (long)sheet.getRow(i).getCell(j).getNumericCellValue();
//					System.out.println(cellValue);
					if (lastcellIndex == 32) {
						expectedDayList.add(String.valueOf((long) sheet.getRow(i).getCell(j).getNumericCellValue()));
					} else if (lastcellIndex == 120) {
						expectedYearList.add(String.valueOf((long) sheet.getRow(i).getCell(j).getNumericCellValue()));
					}
				}
				workbook.close();
				System.out.println(expectedDayList);
				System.out.println(expectedMonthList);
				System.out.println(expectedYearList);
			}
			
		}
	}
}
