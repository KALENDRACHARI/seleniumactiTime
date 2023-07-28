package com.actiTime.genernic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getpropertiesdata(String key) throws Throwable {
		FileInputStream fis=new FileInputStream("./data1/common.properties");
		Properties p=new Properties();
		p.load(fis);
		 String date1 = p.getProperty(key);
		return date1;
	}
	
	public String getExcelDate(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException    {
		FileInputStream fis=new FileInputStream("./data1/testscript1.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String data1 = workbook.getSheet("sheetname").getRow(row).getCell(cell).getStringCellValue();
		return data1;
		
	}

}
