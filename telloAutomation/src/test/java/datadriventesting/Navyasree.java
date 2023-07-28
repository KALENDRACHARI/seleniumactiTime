package datadriventesting;


import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Navyasree {
	public static void main(String[] args) throws Throwable{
	CellType celltype;
		List<String> expectedslnoList=new ArrayList<String>();
		List<String> expectednameList = new ArrayList<String>();
		List<String> expectedsalaryList = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("./srs/test/resource/navya.xlsx");
		Workbook workBook = WorkbookFactory.create(fis);
		Sheet sheet = workBook.getSheet("ACHARI");
		 int column_count=sheet.getRow(0).getPhysicalNumberOfCells();
		// System.out.println(column_count);
		int firstRowIndex = sheet.getFirstRowNum();
		int lastRowIndex = sheet.getLastRowNum();
		//System.out.println(firstRowIndex);
		//System.out.println(lastRowIndex);
		for(int i= 0; i<column_count;i++) {
			 
			for(int j = firstRowIndex+1;j<lastRowIndex;j++) {
				  Cell c = sheet.getRow(j).getCell(i);
				  if(c!=null) {
				 celltype=sheet.getRow(j).getCell(i).getCellType();
	
				if (String.valueOf(celltype).equals("STRING")) {
					//System.out.println(j+ " "+" "+i);
					//System.out.print(sheet.getRow(j).getCell(i).getStringCellValue());
				expectedslnoList.add(sheet.getRow(j).getCell(i).getStringCellValue());
				}else if (String.valueOf(celltype).equals("NUMERIC")) {
				
					if (i==0) {
						//System.out.println(j+ " "+" "+i);
						//System.out.println(sheet.getRow(j).getCell(i).getNumericCellValue());
						expectednameList.add(String.valueOf((long)sheet.getRow(j).getCell(i).getNumericCellValue()));
					}
				else if (i==2) {
					//System.out.println(j+ " "+" "+i);
					//System.out.println(sheet.getRow(j).getCell(i).getNumericCellValue());
					expectedsalaryList.add(String.valueOf((long)sheet.getRow(j).getCell(i).getNumericCellValue()));	
					
				}
			}
			}
		}
		}
		workBook.close();	
		
	System.out.println("slno"+expectedslnoList);
		System.out.println("name"+expectednameList);
		System.out.println("salary"+expectedsalaryList);
		
	}
}