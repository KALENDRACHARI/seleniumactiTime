
package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReaddatafromExcaldaymonthyear1 {
public static void main(String[] args) throws Throwable {
//	create fileInputStream with root path in the code 
	List<String> expectedDayList = new ArrayList<String>();
	List<String> expectedMonthList = new ArrayList<String>();
	List<String> expecetedYearList = new ArrayList<String>();
	FileInputStream file=new FileInputStream("./srs/test/resource/dropdowndaymonthyear.xlsx/");
//	create workbook in same referances root path and method call statement in the create file
	Workbook workbook = WorkbookFactory.create(file);
	Sheet sheet = workbook.getSheet("mydata");
     int firstRowNum = sheet.getFirstRowNum();
     int lastRowNum = sheet.getLastRowNum();
     for(int i=firstRowNum;i<lastRowNum;i++)
     {
    	 int firstcellIndex =(int) sheet.getRow(i).getFirstCellNum();
    	 int lastcellIndex = (int) sheet.getRow(i).getLastCellNum();
    	 System.out.println(lastcellIndex);
    	 for(int j=firstcellIndex+1;j<lastcellIndex;j++) {
    		 CellType cellType = sheet.getRow(i).getCell(j).getCellType();
    		 {
    		 if(String.valueOf(cellType).equals("STRING")) {
    		 expectedMonthList.add(sheet.getRow(i).getCell(j).getStringCellValue());
    	  } else if (String.valueOf(cellType).equals("NUMERIC")) {
    		 if (lastcellIndex == 32) {
					expectedDayList.add(String.valueOf((long) sheet.getRow(i).getCell(j).getNumericCellValue()));
				} else if (lastcellIndex == 120) {
					expecetedYearList.add(String.valueOf((long) sheet.getRow(i).getCell(j).getNumericCellValue()));
				}
			}
    	 }
    	 } 
     workbook.close();
    System.out.println(expectedDayList);
    System.out.println(expectedMonthList);
    System.out.println(expecetedYearList);
}
}
}
