 package testrunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/resources/features/ValidLoginPage.feature"},
		glue = {"LoginPage_stepdefinitions_1", "apphooks"},
				 plugin= {"pretty" ,
						 "html:target/creport/Positivecucumber.html",
						 "json:target/creport/Positivecucumber.json",
				 		 "junit:target/creport/Positivecucumber.xml"}
		
		)
public class LoginPage_testrunner extends AbstractTestNGCucumberTests{

}
