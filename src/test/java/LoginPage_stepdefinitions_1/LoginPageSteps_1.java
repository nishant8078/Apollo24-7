package LoginPage_stepdefinitions_1;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import com.aventstack.extentreports.Status;
import com.pages.*;
import com.utility.Utility;
import io.cucumber.java.en.*;

public class LoginPageSteps_1 extends Utility{
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
public void chrome_is_opened_and_apollo247_app_is_opened() throws IOException {
	objectMethod();
	Utility.implicitWait();
	System.out.println("****** Chrome is opened and Landing page is visisble******");
}
@When("User navigate on landing page")
public void user_navigate_on_landing_page() throws IOException {
	objectMethod();
	logger = report.createTest("test01");
    logger.log(Status.INFO, "Validating landing page title");
	String actualtitle = ldp.validateLandinPageTitle();
	String expectedtitle = "Apollo 247 - Online Doctor Consultation & Book Lab Tests at Home"; 
	try {
	assertEquals(expectedtitle, actualtitle);
	assert true;
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
	System.out.println("************ BUTTON IS DISPLAYED *************");
	assertEquals(true, ldp.isdisplayed());
	System.out.println("ELEMENT IS DISPLAYED - ASSERT PASSED");
	assertEquals(true, ldp.isEnable());
	System.out.println("ELEMENT IS ENABLED - ASSERT PASSED");
	logger.log(Status.INFO, "Step2 is executed");
	ut.captureScreenshot();
	Utility.implicitWait();
}
@When("User clicks on login button")
public void user_clicks_on_login_button() throws IOException {
	objectMethod();
	ldp.cancelpopupbutton();
	Utility.implicitWait();
	ldp.loginbutton_open();
	Utility.implicitWait();
	logger.log(Status.INFO, "Step 3 is executed");
}
@Then("User enters valid {string} mobile number")
public void User_enters_valid_mobile_number(String validmobilenumber) throws Exception {
  objectMethod();
  lp.validmobilelogin(validmobilenumber);
  Utility.implicitWait();
  lp.login_click(); 
  logger.log(Status.INFO, "Step 4 is executed");
}
@When("User click on arrow button")
public void user_click_on_arrow_button() throws IOException {
	objectMethod();
	Utility.implicitWait();
	lp.login_click();
	Utility.implicitWait();
	logger.log(Status.INFO, "Step 5 is executed");
}
@When("After entering OTP click on arrow button")
public void after_entering_otp_click_on_arrow_button() throws Exception {
	objectMethod();
	Thread.sleep(15000);
	lp.afterotp_button();
	Utility.implicitWait();
	ut.captureScreenshot();
	Utility.implicitWait();
	logger.log(Status.INFO, "Step 6 is executed");
}
@Then("Users details are printed on the console")
public void users_details_are_printed_on_the_console() throws IOException {
	objectMethod();
	Utility.implicitWait();
	hp.loginclicktwo();
	Utility.implicitWait();
	hp.printingDetailsOfuser();
	logger.log(Status.INFO, "Step 7 is executed");
}
@Then("User will click on orders button for navigating on my orders page")
public void user_will_click_on_orders_button_for_navigating_on_my_orders_page() throws Exception {
	objectMethod();
	Utility.implicitWait();
	hp.myProfile();
	Utility.implicitWait();
	ut.captureScreenshot();
	logger.log(Status.INFO, "Step 8 is executed");
}
@Then("User will go back to home page")
public void user_will_go_back_to_home_page() throws Exception {
	objectMethod();
	ut.captureScreenshot();
	Utility.implicitWait();
	hp.goingback();
	Utility.implicitWait();
	logger.log(Status.INFO, "Step 9 is executed");
}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	