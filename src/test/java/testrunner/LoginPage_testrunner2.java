package testrunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/resources/features/InvalidLoginPage.feature"},
		glue = {"LoginPage_stepdefinitions_2", "apphooks"},
				 plugin= {"pretty" ,
						 "html:target/creport/Negativecucumber.html",
						 "json:target/creport/Negativecucumber.json",
				 		 "junit:target/creport/Negativecucumber.xml"}
		
		)
public class LoginPage_testrunner2 extends AbstractTestNGCucumberTests{

}
