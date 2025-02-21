package org.selenium.CucumberTest.TESTCucumber;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.selenium.FunctionalLibrary.BaseClass;

public class AutomationPractice  {
	
	public static String elementFromWorkbook(String text,int id) throws Throwable
	{
	File f= new File("D:\\MyTable4.xlsx");
	FileInputStream fin=new FileInputStream(f);
	Workbook excelWorkbook = new XSSFWorkbook(fin);
	Sheet sheet = excelWorkbook.getSheet("Sheet1");
	
	String k = null;
	int rowid=0;
	int columnid=0;
	
	
	Row row = sheet.getRow(0);
	int noOfCell = row.getPhysicalNumberOfCells();
	for (int j =0; j < noOfCell; j++) {
	Cell cell = row.getCell(j);
	String value = cell.getStringCellValue();
	
	if(value.contains(text))
	{
		
		  k =value;
		  columnid=j;	
		//System.out.println(value);
	}

	}
	
	String reqText = null;
		
		Row rows=sheet.getRow(id);
			
		Cell cell = rows.getCell(columnid);
		String stringCellValue = cell.getStringCellValue();
		
		reqText=stringCellValue;
		
		System.out.print(reqText+"\t");	
	
	
	return reqText;

	}
	

	public static void main(String[] args) throws Throwable {
	
		elementFromWorkbook("Mobile",1);
	}
}

