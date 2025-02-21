package org.selenium.CucumberTest.TESTCucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.selenium.FunctionalLibrary.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Selenium\\TESTCucumber\\org.selenium.FeatureFile\\FeatureFile.feature",glue="org.selenium.StepDefinition",
dryRun=false,monochrome=true)
public class TestRunner extends BaseClass {
	
	@BeforeClass
	public static void browserLauch()
	{
		driverLaunch("chrome", "http://automationpractice.com/index.php");
	}
	@AfterClass
	public static void closeDriver()
	{
		driver.close();
	}

}
