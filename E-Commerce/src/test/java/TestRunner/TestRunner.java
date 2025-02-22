package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ={"src/test/java/Feature Files"},
glue = {"StepDefinition"},
dryRun =false,
monochrome = true,
tags = "@Regression and not @smoke",
plugin = {"pretty","html:Execution Reports/htmlreport.html"}
)

public class TestRunner extends AbstractTestNGCucumberTests {

}
