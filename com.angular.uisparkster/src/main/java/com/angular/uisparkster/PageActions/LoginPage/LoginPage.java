package com.angular.uisparkster.PageActions.LoginPage;

import org.openqa.selenium.support.PageFactory;

import com.angular.uisparkster.TestBase.Testbase;

public class LoginPage extends Testbase {
	
	
	
	public LoginPage() 
	{
		
		PageFactory.initElements(driver, this);
		
	}


	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	

}
