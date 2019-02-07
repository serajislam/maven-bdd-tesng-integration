package testRunner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {
		"C:\\Users\\Seraj Islam\\workspace\\maven-bdd-testng-integration\\src\\main\\java\\Features\\homepage.feature" }, 
						glue = {"stepDefinition", "utility" }, 	
						format = { "pretty"}, 
						monochrome = true, 
						strict = true, 
						dryRun = false, 
						tags = {"@invokeBrowser" }, 
						plugin = {"html:target/cucumber-reports/report","json:target/cucumber-json-reports/report" })

@Test
public class RunnerClass extends AbstractTestNGCucumberTests {

}
