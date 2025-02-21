package org.selenium.CucumberTest.TESTCucumber;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AutomationDataDriven {
	
	public static void main(String[] args) throws Throwable {
		 String next=null;
					
		for(int b=0;b<2;b++)
		{
		File f= new File("D:\\MyTable4.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook wrkbook = new XSSFWorkbook(fin);
		
		Sheet sheet1 = wrkbook.getSheetAt(0);				
		for (int a = 1; a < 17; a++) 
		{
			Scanner sin=new Scanner(System.in);
				
			 Row row = sheet1.getRow(a);	
			 System.out.println(row.getCell(0));
			 next = sin.next();	
		if(row==null) 
			row=sheet1.createRow(a);
		
		for (int i = 1; i <=2; i++) 
		{
		Cell cell = row.getCell(i);
		
		if(cell==null) {
	
			cell=row.createCell(i);
		cell.setCellValue(next);
		
			}
	
		
		}
		FileOutputStream fout=new FileOutputStream(f);
		wrkbook.write(fout);
		}
		
		}
		
	}
}
		
	
	

