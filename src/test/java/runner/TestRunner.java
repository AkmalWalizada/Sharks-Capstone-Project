package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "classpath:feature",  // we provide path of feature folder	
		glue = "step.definitions",  // we provide path of step definition classes
		tags = "@Test",	// with tags we will run our test cases
		dryRun = false,				// DryRun checks if there is any missing step def
		monochrome = true,			// it makes console readable 
		strict = true,				// this will mark a scenario failed if one step failed
		plugin = {"pretty","html:target/site/cucumber-pretty",
					"json:C:\\Users\\akmal\\eclipse-workspace\\us.tekschool.capstone.bdd\\target\\cucumber.json"},
		publish= true				// this will generate execution report
		)


public class TestRunner {
	
	/**
	 * @AfterClass will execute the block of code when all scenarios are completed 
	 * or in another word, @AfterClass executes after "After Hooks of last scenario.
	 */
	@AfterClass
	public static void generateReport() {
		CucumberReportingConfig.reportConfig();
	}

}
