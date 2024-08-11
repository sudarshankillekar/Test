package parallel;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		        publish = true ,
				features = {"@target/failedrun.txt"},
				monochrome = true,
				glue = {"parallel"},
						plugin = {"pretty",
								"rerun:target/failedrerun.txt"}						
				)
public class RerunFailedScripts extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel = true)
	public Object [] [] scenarios(){
		return super.scenarios();
	}

}
