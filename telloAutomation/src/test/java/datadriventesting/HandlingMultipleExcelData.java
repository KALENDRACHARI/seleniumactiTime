package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingMultipleExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./srs/test/resource/kali1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowcount = wb.getSheet("createlogin").getLastRowNum();
		for(int i=1;i<=rowcount;i++) {
			String slno1 = wb.getSheet("createlogin").getRow(i).getCell(1).getStringCellValue();
			
			String name = wb.getSheet("createlogin").getRow(i).getCell(2).getStringCellValue();
			//String subject = wb.getSheet("createlogin").getRow(i).getCell(i).getStringCellValue();
			System.out.println(slno1+"  "+name);
			//System.out.println(name);
			
		}
	}

}
