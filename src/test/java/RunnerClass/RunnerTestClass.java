package RunnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= "src\\test\\java\\FeatureFiles",
		glue="StepDefination",
		monochrome= true,
		dryRun=true
		
		
		)



public class RunnerTestClass extends AbstractTestNGCucumberTests {

}
