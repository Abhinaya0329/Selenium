package com.qsp.genricutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getStringDataFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fil = new FileInputStream("./src/test/resources/TestscriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fil);
		return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();
		
	}
	public double getNumberDataFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fil = new FileInputStream("./src/test/resources/TestscriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fil);
		return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getNumericCellValue();
		

}
	public boolean getbooleanFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fil = new FileInputStream("./src/test/resources/TestscriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fil);
		return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();
		
}  
}
