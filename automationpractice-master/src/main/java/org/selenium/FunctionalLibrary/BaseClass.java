package org.selenium.FunctionalLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



import java.sql.PreparedStatement;


import junit.framework.Assert;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver driverLaunch(String drivername,String url) {
		
		if(drivername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(drivername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\driver\\gecko.exe");
			driver=new FirefoxDriver();
		}
		else if(drivername.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\driver\\internetexplorer.exe");
			driver=new InternetExplorerDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
			return driver;
		}
	
	public static void readFromExcel() {
		
		

	}
	
	public static void isElementDisplayed(WebElement element) {
		Assert.assertTrue(element.isDisplayed());
		
	}
	
	public static void isElementEnabled(WebElement element) {
		Assert.assertTrue(element.isEnabled());
		
	}
	public static void isElementSelected(WebElement element) {
		Assert.assertTrue(element.isSelected());
		
	}
	
	public static void sendKeysToElement(WebElement element,String text) {
		element.clear();
		Assert.assertTrue(element.isDisplayed());
		element.sendKeys(text);
	}
	
	public static void elementClick(WebElement element) {
		
		element.click();

	}
	
	public static void dropDownSelect(WebElement element,String method,String value) throws InterruptedException {
		Select sc=new Select(element);
		
		if(method.equalsIgnoreCase("value"))
		{
			sc.selectByValue(value);			
		}
		else if(method.equalsIgnoreCase("index"))
		{
			int value1=Integer.parseInt(value);
			sc.selectByIndex(value1);
			
		}
		else if(method.equalsIgnoreCase("text"))
		{
			sc.selectByVisibleText(value);
		}
		
	}
	public static void mouseHover(WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	public static void mouseHoverClick(WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element).click().build().perform();
	}
	
	public static void mySqlwrite(String Userid,String Pwd) throws Throwable
	{
		String value = null;

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root",
				"admin");
		try {
			String query = "INSERT INTO mytable " + "VALUES ('" + Userid + "',  '" + Pwd + "')";
			Statement stmnt = con.createStatement();

			stmnt.execute(query);

		} catch (Exception e) {
			System.out.println(e.fillInStackTrace());

		} finally {
			con.close();
		}

	}
	
	public static String mySqlRead(String columnname,String loginid) throws Throwable
	{
		String value = null;

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root",
				"admin");
		try {
			String query = "SELECT " + columnname + " FROM mytable where " + columnname + "='" + loginid + "'";

			java.sql.PreparedStatement ps = (PreparedStatement) con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				value = rs.getString(columnname);

			}
		} catch (Exception e) {
			System.out.println(e.fillInStackTrace());

		} finally {
			con.close();
		}

		return value;
	}
	
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
	

}
