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

public class HomePage extends Utility
{ 
	// THIS IS THE SECOND LOGIN BUTTON(PROFILE BUTTON) ON THE HOME PAGE AFTER USER IS SUCESSFULLY LOGGED INTO THE WEBSITE
	@FindBy(xpath="//*[@class='icon-ic_account']")
	WebElement login_click2;   
	
	
    // THIS IS THE PATH FOR PRINTING THE USERS DETAILS WHEN USER CLICKS ON LOGIN BUTTON THE USER DETAILS ARE SHOWN IN THE BOX 
	@FindBy(xpath="//*[@class='Profile_userDetails__L9AzH']")
	WebElement printing_Details;   

    // THIS IS THE PATH FOR NAVIGATING ON MY ORDERS PAGE
	@FindBy(xpath="//*[@href='/orders']")
	WebElement myorders;   
	
    // THIS IS THE PATH FOR THE HOME PAGE BUTTON ON THE MY ORDERS PAGE 
	@FindBy(xpath="//*[@href='/']")//going back to home page after myorder
	WebElement Home_back;
	
	
	
	
	
	
	public HomePage() throws IOException
	{
		PageFactory.initElements(driver, this);
	} 
	
	
	
	public void loginclicktwo()
	{
		 login_click2.click(); 
		 // THIS FUNCTION WILL CLICK ON THE PROFILE BUTTON ON THE HOME PAGE
	} 
	
	
	public void printingDetailsOfuser()
	{
		System.out.print(printing_Details.getText()); 
		// THIS FUNCTION WILL PRINT THE DETAILS ON CONSOLE AFTER USER HAS CLICKED ON PROFILE BUTTON
	} 
	
	
	
	public void myProfile() {
		myorders.click();
		// THIS FUNCTION WILL CLICK ON THE MY ORDERS BUTTON 
	}
	
	public void goingback() {
		Home_back.click();
		// THIS FUNCTION WILL CLICK ON HOME BUTTON ON THE MY ORDERS PAGE 
	}
	

}
