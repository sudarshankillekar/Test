package parallel;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		        publish = true ,
				features = {"src\\test\\resources\\parallel\\EdashBoard.feature"},
				monochrome = true,
				glue = {"parallel"},
						plugin = {"pretty",
								"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
								"timeline:test-output/","rerun:target/failedrerun.txt"}
		  //      tags = "not @skip"
				)

public class parallelRun extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object [] [] scenarios(){
		return super.scenarios();
	}
	
}
