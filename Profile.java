package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/java/feature/Profile.feature",
	    glue = {"stepdefinition"},
	    plugin = {"pretty", "html:target/Profile-reports"},
	    monochrome = true
	)
public class Profile  extends AbstractTestNGCucumberTests {

}

