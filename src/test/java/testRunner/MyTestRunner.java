package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		        publish = true ,
				features = {"src\\test\\resources\\AppFeatures\\DashBoardPage.feature"},
				glue = {"stepdefinations", "AppHooks"},
				plugin = {"pretty","html:target/cucumber-reports"},
		        monochrome = true
				)

public class MyTestRunner {

}
