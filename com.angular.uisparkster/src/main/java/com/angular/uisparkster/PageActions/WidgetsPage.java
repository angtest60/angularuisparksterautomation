package com.angular.uisparkster.PageActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.angular.uisparkster.TestBase.Testbase;
import com.angular.uisparkster.TestUtils.TestUtils;

public class WidgetsPage extends Testbase {
	
	
	
	@FindBy(xpath="//*[@id=\"heading\"]")
	WebElement widgets_Heading;
	
	
	@FindBy(xpath="//*[@id=\"textbox\"]")
	WebElement widgets_Textbox;
	
	
	
	
	
	
	public WidgetsPage() 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	public  void widgets_Heading_properties()
	{
		TestUtils.waitforwebdriver_visibilityelement(widgets_Heading);
		widgets_Heading.click();
		
		
		
	}
	
	
	public  void widgets_Textbox_properties()
	{
		TestUtils.waitforwebdriver_visibilityelement(widgets_Textbox);
		widgets_Textbox.click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
