package testrunners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/java/feature/Programs.feature",
	    glue = {"stepdefinition"},
	    plugin = {"pretty", "html:target/Programs-reports"},
	    monochrome = true
	)
public class Programs  extends AbstractTestNGCucumberTests {

}

