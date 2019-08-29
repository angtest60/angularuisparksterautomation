package com.angular.uisparkster.PageActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.angular.uisparkster.TestBase.Testbase;
import com.angular.uisparkster.TestUtils.TestUtils;

public class WidgetsPage_TextBox  extends Testbase {
	
	
	@FindBy(xpath="//*[@id=\"textbox\"]")
	WebElement widgets_Textbox;
	
	
	
	public WidgetsPage_TextBox() 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public  void widgets_Textbox_iconclick()
	{
		TestUtils.waitforwebdriver_visibilityelement(widgets_Textbox);
		
		widgets_Textbox.click();
	
	}
	
	
	

}
