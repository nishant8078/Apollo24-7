package LoginPage_Excel_stepdefinitions_3;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import com.aventstack.extentreports.Status;
import com.pages.HomePage;
import com.pages.LandingPage;
import com.pages.LoginPage;
import com.utility.Config;
import com.utility.ExcelReader;
import com.utility.Utility;

import io.cucumber.java.en.*;

public class LoginPage_Excel_steps_3 extends Utility{
	public LandingPage ldp;
	public LoginPage lp;
	public HomePage hp;
	public Utility ut;
	ExcelReader reader;
	public void objectMethod()throws IOException
	{
		ldp = new LandingPage();
		lp  = new LoginPage();
		hp  = new HomePage();
		ut  = new Utility(); 
	}

	
	@Given("Chrome is opened and apollo247 app is opened")
	public void chrome_is_opened_and_apollo247_app_is_opened() throws InterruptedException, IOException {
		objectMethod();
		Utility.implicitWait();
		System.out.println("******Chrome is opened and Landing page is visisble******");
	}
	@When("User navigate on landing page")
	public void user_navigate_on_landing_page() throws InterruptedException, IOException {
		objectMethod();
		logger = report.createTest("test01");
	    logger.log(Status.INFO, "Validating landing page title");
	    
	    try {
		String actualtitle = ldp.validateLandinPageTitle();
		String expectedtitle = "Apollo 247 - Online Doctor Consultation & Book Lab Tests at Home"; 
		assertEquals(expectedtitle, actualtitle);
		System.out.println("**** Titles are Matching of the website********"); 
		Utility.implicitWait();
		logger.log(Status.INFO, "Step1 is executed");
	    }
		catch(AssertionError e)
        {
            e.printStackTrace();
            logger.log(Status.FAIL, "Step 1 is failed");
            captureScreenshotOnFailure();
            assert false;
        }
	}
	
	@Then("Fields on navigation page are visible to the user")
	public void fields_on_navigation_page_are_visible_to_the_user() throws Exception {
		objectMethod();
		System.out.println("************ALL TEXT ON WEBSITE ARE *************");
		System.out.println("ELEMENT IS DISPLAYED - ASSERT PASSED");
		assertEquals(true, ldp.isEnable());
		System.out.println("ELEMENT IS ENABLED - ASSERT PASSED");
		ut.captureScreenshot();
		Utility.implicitWait();
		logger.log(Status.INFO, "Step2 is executed");
	}
	
	@Then("User clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException, IOException {
		objectMethod();
		ldp.cancelpopupbutton();
		Utility.implicitWait();
		ldp.loginbutton_open();
		Utility.implicitWait(); 
		logger.log(Status.INFO, "Step3 is executed");
	}
	
	
	@Then("User enters contact number from sheet name {string} and row number {int}")
	public void user_enters_contact_number_from_sheet_name_and_row_number(String SheetName, Integer RowNumber) throws Exception {
      objectMethod();
      reader = new ExcelReader();
      List<Map<String,String>> testData = reader.getData(Config.excelPath, SheetName);
      String Mobile = testData.get(RowNumber).get("contact");
      lp.Parameterizedmobilelogin(Mobile);
      Thread.sleep(1000);
      lp.mobileError();
	  ut.captureScreenshot();
	  logger.log(Status.INFO, "Step4 is executed");
	}
	
	
	@Then("User should get the invalid mobile error text on console")
	public void User_should_get_the_invalid_mobile_error_text_on_console() throws Exception {
		objectMethod();
		lp.mobileError();
		ut.captureScreenshot();
		logger.log(Status.INFO, "Step 5 is executed");
	}
	
	
	

}
