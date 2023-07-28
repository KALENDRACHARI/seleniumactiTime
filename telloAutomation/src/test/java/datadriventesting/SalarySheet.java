package datadriventesting;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SalarySheet {
	public static void main(String[] args) throws Throwable {
		List<String> expectedSLNOlist = new ArrayList<String>();
		List<String> expectedNAMElist = new ArrayList<String>();
		List<String> expectedSALARYlist = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("./srs/test/resource/salary.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("salarysheet");
		
		int firstRowIndex = sheet.getFirstRowNum();
		int lastRowIndex = sheet.getLastRowNum();

		for (int i = firstRowIndex; i <= lastRowIndex; i++) {
			int firstcellIndex = (int) sheet.getRow(i).getFirstCellNum();
			int lastcellIndex = (int) sheet.getRow(i).getLastCellNum();
			// System.out.println(lastcellIndex);
			for (int j = firstcellIndex; j < lastcellIndex; j++) {
				CellType cellType = sheet.getRow(i).getCell(j).getCellType();
				{
					if (String.valueOf(cellType).equals("STRING")) {
						expectedNAMElist.add(sheet.getRow(i).getCell(j).getStringCellValue());
						// System.out.println(expectedNAMElist);
					} else if (String.valueOf(cellType).equals("NUMERIC")) {
						if (lastcellIndex == 3) {
							if(cellType!=null) {
								cellType=sheet.getRow(i).getCell(j).getCellType();
								
							
							expectedSLNOlist
									.add(String.valueOf((long) sheet.getRow(i).getCell(j).getNumericCellValue()));
						} else if (lastcellIndex == 11) {
							expectedSALARYlist
									.add(String.valueOf((long) sheet.getRow(i).getCell(j).getNumericCellValue()));
						}
					}
				}

			}
			workbook.close();

		}
		System.out.println(expectedSLNOlist);
		System.out.println(expectedNAMElist);
		System.out.println(expectedSALARYlist);
	}
}
}