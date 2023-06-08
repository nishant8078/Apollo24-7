package LoginPage_stepdefinitions_2;


import static org.testng.Assert.assertEquals;

import java.io.IOException;

import com.aventstack.extentreports.Status;
import com.pages.*;
import com.pages.HomePage;
import com.pages.LandingPage;
import com.pages.LoginPage;
import com.utility.Utility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps_2 extends Utility{
	public LandingPage ldp;
	public LoginPage lp;
	public HomePage hp;
	public Utility ut;
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
		logger.log(Status.INFO, "Step 2 is executed");
	}
	
	@When("User clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException, IOException {
		objectMethod();
		Utility.implicitWait();
		Thread.sleep(3000);
		ldp.cancelpopupbutton();
		Utility.implicitWait();
		ldp.loginbutton_open();
		Utility.implicitWait(); 
		logger.log(Status.INFO, "Step 3 is executed");
	}
	
	@Then("User enters invalid {string} mobile number")
	public void user_enters_invalid_mobile_number(String string) throws Exception {
	  objectMethod();
	  lp.Parameterizedmobilelogin(string);
	  logger.log(Status.INFO, "Step 4 is executed");
	}
	

	@Then("User should get the invalid mobile error text on console")
	public void User_should_get_the_invalid_mobile_error_text_on_console() throws Exception {
		objectMethod();
		lp.mobileError();
		ut.captureScreenshot();
		logger.log(Status.INFO, "Step 5 is executed");
	}
	
	
	
	@Then("User enters valid {string} mobile number")
	public void User_enters_valid_mobile_number(String validmobilenumber) throws Exception {
	  objectMethod();
	  lp.validmobilelogin(validmobilenumber);
	  Utility.implicitWait();
	  lp.login_click(); 
	  logger.log(Status.INFO, "Step 6 is executed");
	}
	
	@When("User click on arrow button")
	public void user_click_on_arrow_button() throws IOException {
		objectMethod();
		Utility.implicitWait();
		lp.login_click();
		Utility.implicitWait();
		logger.log(Status.INFO, "Step 7 is executed");
	}
	
	@When("User enters invalid OTP {string}")
	public void User_enters_invalid_OTP(String invalidOTP) throws Exception {
		objectMethod();
		Thread.sleep(1500);
		lp.enterOTP(invalidOTP);
		Thread.sleep(1500);
		lp.afterotp_button();
		Utility.implicitWait();
		Utility.implicitWait();
		logger.log(Status.INFO, "Step 8 is executed");
	}
	
	

	@Then("User should get the invalid OTP error text on console")
	public void user_should_get_the_invalid_OTP_error_text_on_console() throws Exception {
		objectMethod();
		lp.otpError();
		ut.captureScreenshot();
		logger.log(Status.INFO, "Step 9 is executed");
	}
	
	
	
	
	
	
	
	
	
	
	

}


	