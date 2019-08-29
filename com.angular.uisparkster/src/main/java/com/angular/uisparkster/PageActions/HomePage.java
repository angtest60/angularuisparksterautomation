package com.angular.uisparkster.PageActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.angular.uisparkster.TestBase.Testbase;
import com.angular.uisparkster.TestUtils.TestUtils;

public class HomePage extends Testbase {
	
	
	
	@FindBy(xpath="//*[@class='sparksterlogo']")
	WebElement sparklogo;
	
	@FindBy(xpath="//*[@id=\"addcontainer\"]")
	
	WebElement AddContainer;
	
	@FindBy(xpath="//*[@id=\"addheader\"]")
	WebElement AddHeader;
	
	
	@FindBy(xpath="//*[@id=\"addfooter\"]")
	WebElement AddFooter;
	
	
	@FindBy(xpath="//*[@id=\"deletecontainer\"]")
	WebElement DeleteContainer;
	
	@FindBy(xpath="//*[@id=\"deletewidget\"]")
	WebElement DeleteWidgets;
	
	@FindBy(xpath="//*[@id=\"showhidecontainer\"]")
	WebElement ShoworhideContainer;
	
	@FindBy(xpath="//*[@id=\"splitcontainer\"]")
	WebElement SplitContainer;
	
	
	

	
	@FindBy(xpath="//*[@id=\"menuicons\"]")
	WebElement LayoutIcon;
	
	@FindBy(xpath="//*[@id=\"menu-widgets\"]")
	WebElement WidgetsIcon;
	
	@FindBy(xpath="//*[@id=\"menu-properties\"]")
	WebElement PropertiesIcon;
	
	@FindBy(xpath="//*[@id=\"menu-templates\"]")
	WebElement TemplatesIcon;
	
	@FindBy(xpath="//*[@id=\"menu-libraries\"]")
	WebElement LibrariesIcon;
	
	@FindBy(xpath="//*[@id=\"menu-collaborate\"]")
	WebElement CollaborateIcon;		
	
	
	
	
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public boolean validateSparksterLogo()
	{
		return sparklogo.isDisplayed();
	}
	
	public  void addcontainer_click()
	{
		TestUtils.waitforwebdriver_visibilityelement(AddContainer);
		AddContainer.click();
	}
	
	
	
	public WidgetsPage  WidgetsIcon_click()
	{
		
		TestUtils.waitforwebdriver_visibilityelement(WidgetsIcon);
		WidgetsIcon.click();
		return new WidgetsPage();
	}
	
	
	
	
	
	

}
