package com.pages;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class LandingPage extends Utility 
{
//THIS IS THE PATH FOR VALIDATING THE ELEMNT ON THE LANDING PAGE 
	@FindBy(xpath="//a[@title='Book Lab Tests']")
	WebElement button; 
	
//	THIS IS THE FIRST POP UP SHOWN ON THE LANDING PAGE
	@FindBy(xpath="//button[@id='wzrk-cancel']")
	private WebElement popupcancel; 
	
//	THIS IS THE LOGIN BUTTON ON LANDING PAGE FOR SHOWING LOGIN PAGE
	@FindBy(xpath="//div[@id='loginPopup']")
	private WebElement loginButton;
	
	
	
	public LandingPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	
	} 
	
	public String validateLandinPageTitle()
	{
		return driver.getTitle(); 
//		THIS FUNCTION WILL RETURN THE TITLE OF THE APOLLO247 WEBSITE
	} 
	
	
	public boolean isdisplayed()
	{
		return button.isDisplayed();
//		THIS WILL Check BUTTON IS DISPLAYED ON LANDING PAGE
	} 
	
	public boolean isEnable()
	{
		return button.isEnabled();
//		THIS WILL Check BUTTON IS ENABLED AND DISPLAYED ON LANDING PAGE
	} 
	
	public void cancelpopupbutton() {
		popupcancel.click();
//		THIS FUNCTION WILL CLICK ON POPUP ON LANDING PAGE
	}
	
	public void loginbutton_open() {
		loginButton.click();
//		THIS FUNCTION WILL CLICK ON LOGIN BUTTON 
	}
	
}
	


