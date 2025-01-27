package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/java/feature/form.feature",
	    glue = {"stepdefinition"},
	    plugin = {"pretty", "html:target/Form-reports"},
	    monochrome = true
	)
public class Form extends AbstractTestNGCucumberTests {

}

