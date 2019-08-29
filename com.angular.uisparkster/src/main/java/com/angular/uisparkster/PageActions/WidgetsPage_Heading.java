package com.angular.uisparkster.PageActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.angular.uisparkster.TestBase.Testbase;
import com.angular.uisparkster.TestUtils.TestUtils;

public class WidgetsPage_Heading extends Testbase{



	@FindBy(xpath="//*[@id=\"heading\"]")
	WebElement widgets_Heading;
  
	
	
	@FindBy(xpath="//*[@class=\"sparksterwid widgetLabel\"]")
	WebElement clickinside_Heading;
	
	
	
	
	
	
	
	
	
	
	
	public WidgetsPage_Heading() 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public  void widgets_heading_iconclick() throws InterruptedException
	{
		
		
		TestUtils.waitforwebdriver_visibilityelement(widgets_Heading);
		
		widgets_Heading.click();
		Thread.sleep(2000);		
		
}

   public void rename_heading() throws InterruptedException {
   
   
	   TestUtils.waitforwebdriver_visibilityelement(clickinside_Heading);
		
	   clickinside_Heading.click();
	   Thread.sleep(2000);
	   clickinside_Heading.clear();
	   Thread.sleep(2000);
	   clickinside_Heading.sendKeys("Sparkster");
   
   }
}    