package org.selenium.CucumberTest.TESTCucumber;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.SheetBuilder;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class DataDriven {

	public static void main(String[] args) throws Throwable {
		File f = new File("D:\\IPL Team.xlsx");		
		FileInputStream file=new FileInputStream(f);		
		Workbook Excl = new XSSFWorkbook(file);		
		Sheet sheetpos = Excl.getSheetAt(0);
		int noOfRow = sheetpos.getPhysicalNumberOfRows();
		
		for (int i = 0; i <noOfRow; i++) {
			Row row = sheetpos.getRow(i);
			int numOFcell = row.getPhysicalNumberOfCells();
			for (int j = 0; j < numOFcell; j++) {
			Cell cell = row.getCell(j);		
			String stringCellValue = cell.getStringCellValue();
			if(stringCellValue.contains("Facebook.com"))
			{
				Row rows = sheetpos.getRow(i);	
				int numOFcells = rows.getPhysicalNumberOfCells();
				for (int k = 0; k < numOFcells; k++) {
				Cell cells = rows.getCell(k);		
				String stringCellValues = cells.getStringCellValue();
				System.out.print(stringCellValues+"\t");
				}System.out.println();
				}
				}	
			}
		System.out.println("*******************************************8");
		int columnno=0;
		
		for (int i = 0; i <noOfRow; i++) {
			Row row = sheetpos.getRow(i);
			int numOFcell = row.getPhysicalNumberOfCells();
			for (int j = 0; j < numOFcell; j++) {
			Cell cell = row.getCell(j);		
			String stringCellValue = cell.getStringCellValue();
			if(stringCellValue.equalsIgnoreCase("JavaScript"))
			{
			columnno=j;
			}		
			}
			}
			for (int i = 0; i <noOfRow; i++) {
			Row row = sheetpos.getRow(i);
			Cell cell2 = row.getCell(columnno);
			String columnvalue = cell2.getStringCellValue();
			System.out.println(columnvalue);
		}
			System.out.println();
			
				
				
			
			}
	

		}

