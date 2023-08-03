package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\features",  // features = "classpath:features",industry standard either one
		glue="steps",
		tags="@B&CashFeature", // tags can be any name, they are not predefined.
		monochrome=true,//   if monochrome = false, then gives some gibberish language explanation in console
//		dryRun=false,
		plugin= {
				"pretty",
				"html:target/reports/cucumber.html",
				"json:target/reports/cucumber.json",
				
		}
		
		
		
		)
public class LoginRunner {

	
	
	
	
	
	
}
