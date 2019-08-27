package com.angular.uisparkster.PageActions.HomePage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.angular.uisparkster.TestBase.Testbase;
import com.angular.uisparkster.TestUtils.TestUtils;

;

public class WidgetsPage extends Testbase  {


	@FindBy(xpath="//*[@id=\"addcontainer\"]")
	@CacheLookup
	WebElement 	addcontainer;





public WidgetsPage()
{
	
	
	PageFactory.initElements(driver, this);
	
	
	
	
}

public WidgetsPage widgetcheck() {
	
	
	    WebDriverWait wait = new WebDriverWait(driver, 95);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");
		
		WebElement element = wait.until(ExpectedConditions.visibilityOf(addcontainer));
		 Actions action = new Actions(driver);
		
		 js.executeScript("arguments[0].click();", addcontainer);
		 action.moveToElement(element).click().build().perform();
		 TestUtils.highLightElement(driver, addcontainer);
	
	
		 try {
				Thread.sleep(10000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		 
	
	
	return new WidgetsPage();


}}