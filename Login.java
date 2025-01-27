package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/java/feature/Login.feature",
	    glue = {"stepdefinition"},
	    plugin = {"pretty", "html:target/Login-reports"},
	    monochrome = true
	)
public class Login extends AbstractTestNGCucumberTests{

}
