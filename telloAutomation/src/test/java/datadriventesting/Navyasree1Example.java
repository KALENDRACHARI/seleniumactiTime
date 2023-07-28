package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.compress.harmony.pack200.NewAttributeBands.Call;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Navyasree1Example {

	public static void main(String[] args) throws Throwable {
		// Celltype celltype();
		List<String> expectedslnoList = new ArrayList<String>();
		List<String> expectednameList = new ArrayList<String>();
		List<String> expectedsalaryList = new ArrayList<String>();
		List<String> expectedavarageList = new ArrayList<String>();
		List<String> expectedsizeList = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("./srs/test/resource/NAVYASREE.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("ACHARI");
		int coloum_count = sheet.getRow(0).getPhysicalNumberOfCells();
		int firstrowIndex = sheet.getFirstRowNum();
		int lastrowIndex = sheet.getLastRowNum();
		for (int i = 0; i < coloum_count; i++) {

			for (int j = firstrowIndex + 1; j < lastrowIndex; j++) {
				Cell c = sheet.getRow(j).getCell(i);
				if (c != null) {
					CellType celltype = sheet.getRow(j).getCell(i).getCellType();
					if (String.valueOf(celltype).equals("STRING")) {
						expectednameList.add(sheet.getRow(j).getCell(i).getStringCellValue());
					} else if (String.valueOf(celltype).equals("NUMERIC")) {
						if (i == 0) {
							expectedslnoList
									.add(String.valueOf((long) sheet.getRow(j).getCell(i).getNumericCellValue()));
						}
						if (i == 2) {
							expectedsalaryList
									.add(String.valueOf((long) sheet.getRow(j).getCell(i).getNumericCellValue()));
						}
						if (i == 3) {
							expectedavarageList
									.add(String.valueOf((long) sheet.getRow(j).getCell(i).getNumericCellValue()));
						}
						if (i == 4) {
							expectedsizeList
									.add(String.valueOf((long) sheet.getRow(j).getCell(i).getNumericCellValue()));

					}
			}
		}
		workbook.close();
		System.out.println("slno :- " + expectedslnoList);
		System.out.println("name:- " + expectednameList);
		System.out.println("salary:- " + expectedsalaryList);
		System.out.println("avarage:- "+expectedavarageList);
		System.out.println("size:- " +expectedsizeList);
	}

}
}}