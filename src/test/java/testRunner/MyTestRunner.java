package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		        publish = true ,
				features = {"src\\test\\resources\\AppFeatures"},
				glue = {"stepdefinations", "AppHooks"},
						plugin = {"pretty",
								"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
								"timeline:test-output/"}						
				)

public class MyTestRunner {

}

