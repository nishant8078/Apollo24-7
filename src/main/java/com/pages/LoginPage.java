package com.pages;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class LoginPage extends Utility  
{
	
	
//	THIS IS THE PHONE NUMBER ELEMENT AFTER USER CLICKED ON LOGIN BUTTON 
	@FindBy(xpath="//input[@name='mobileNumber']")
	WebElement Login_mobile;  
		
	
//	THIS IS THE ARROW BUTTON ELEMENT NEXT TO THE PHONE NUMBER TEXT BOX
	@FindBy(xpath="//span[@class='MuiFab-label']")
	WebElement login_click;
	
	
//	THIS IS THE ARROW BUTTON ELEMENT NEXT TO THE OTP TEXT BOX
	@FindBy(xpath="//span[@class='icon-ic_arrow_forward']")
	WebElement click_verifyotp;
	
//	THIS IS THE PATH OF ERROR OF OTP FOR FEATURE FILE 2 
	@FindBy(xpath="//div[@class='MuiFormHelperText-root jss83 Mui-error']")
	WebElement otpError;
	
//	THIS IS THE PATH OF ERROR OF MOBILE FOR FEATURE FILE 2 
	@FindBy(xpath="//*[text()='This seems like a wrong number']")
	WebElement mobileError;
	
//	THIS IS THE PATH OF OTP TEXT BOX FOR FEATURE FILE 2 
	@FindBy(xpath="//input[@type='tel']")
	WebElement enterinvalidOTP;
	
	public LoginPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	

	
	public void validmobilelogin(String validmobilelogin) {
		Login_mobile.sendKeys(validmobilelogin);
		//THIS FUNCTION WILL SEND MOBILE NUMBER IN THE PHONE NUMBER TEXT BOX
	}
	
	public void login_click() {
		login_click.click();
		//THIS FUNCTION WILL CLICK ON ARROW BUTTON NEXT TO THE PHONE NUMBER FOR GOING ON OTP PAGE
	}
	
	
	public void afterotp_button() {
		click_verifyotp.click();
		//THIS FUNCTION WILL CLICK ON ARROW BUTTON NEXT TO THE OTP NUMBER FOR GOING ON HOME PAGE
	}
	
		
	
	public void Parameterizedmobilelogin(String string) throws Exception {
		Login_mobile.sendKeys(string);
//		THIS IS THE PARAMETERIZED FUNCTION FOR SENDING WRONG NUMBER
		
	    	
	}
	

    public void otpError() {
		
	    System.out.print(otpError.getText());
//		THIS FUNCTION WILL PRINT THE ERROR OF WRONG OTP	
	} 
    	
    public void mobileError() {
	    System.out.print(mobileError.getText());
//		THIS FUNCTION WILL PRINT THE ERROR OF WRONG MOBILE	
	}


	public void enterOTP(String invalidOTP) {
		// THIS FUNCTION WILL ENTER THE INVALID OTP FOR FEATURE FILE 2
		enterinvalidOTP.sendKeys(invalidOTP);
	} 
	
	
	
//	public String validateLoginPageTitle()
//	{
//		return driver.getTitle(); 
//	} 
}
