package testrunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/resources/features/Login_Page_Excel.feature"},
		glue = {"LoginPage_Excel_stepdefinitions_3", "apphooks"},
				 plugin= {"pretty" ,
						 "html:target/creport/Excelcucumber.html",
						 "json:target/creport/Excelcucumber.json",
				 		 "junit:target/creport/Excelcucumber.xml"}
		)
public class Login_page_Excel extends AbstractTestNGCucumberTests{

}
